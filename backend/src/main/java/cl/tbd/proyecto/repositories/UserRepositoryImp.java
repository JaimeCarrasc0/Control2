package cl.tbd.proyecto.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import cl.tbd.proyecto.models.User;

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

}