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
        final String insertQuery = "INSERT INTO users (name,password,fecha) " +
                "VALUES (:nameU,:passwordU,:fechaU)";

        try (Connection conn = sql2o.open()) {
                int insertedId = (int) conn.createQuery(insertQuery, true) 
                    .addParameter("nameU", user.getName())
                    .addParameter("passwordU", user.getPassword())
                    .addParameter("fechaU", user.getFecha())
                    .executeUpdate().getKey();
                user.setUser_id(insertedId);
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}