package cl.tbd.proyecto.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import cl.tbd.proyecto.models.User;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class UserRepositoryImp implements UserRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<User> getAllUsers(){
        String sql = "SELECT * FROM users";
        try(Connection conn = sql2o.open()){
            List<User> users = conn.createQuery(sql).executeAndFetch(User.class);
            return users;
        }
    }
    
    @Override
    public User getUser(Integer id){
        String sql = "SELECT * FROM users WHERE users.user_id = :id";
        try(Connection conn = sql2o.open()){
            User user = conn.createQuery(sql).addParameter("id", id).executeAndFetchFirst(User.class);
            return user;
        }
    }
    
    @Override
    public User createUser(User user){
        final String maxIdQuery = "SELECT max(user_id) FROM users";

        final String insertQuery = "INSERT INTO users (user_id, name,password) " +
                "VALUES (:user_idU, :nameU,:passwordU)";

        try (Connection conn = sql2o.open()) {
            int maxId = conn.createQuery(maxIdQuery).executeScalar(Integer.class);
                int insertedId = (int) conn.createQuery(insertQuery, true)
                    .addParameter("user_idU", maxId + 1)
                    .addParameter("nameU", user.getName())
                    .addParameter("passwordU", user.getPassword())
                    .executeUpdate().getKey();
                user.setUser_id(insertedId);
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public User updateUser(User user){
        final String insertQuery = "UPDATE users SET name = :nameU, password = :passwordU WHERE user_id = :id";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(insertQuery)
                .addParameter("nameU", user.getName())
                .addParameter("passwordU", user.getPassword())
                .addParameter("id", user.getUser_id())
                .executeUpdate();
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Boolean deleteUser(Integer id){
        final String insertQuery = "DELETE FROM users WHERE user_id = :id";
        try (Connection conn = sql2o.open()) {
            conn.createQuery(insertQuery)
                .addParameter("id", id)
                .executeAndFetch(User.class);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}