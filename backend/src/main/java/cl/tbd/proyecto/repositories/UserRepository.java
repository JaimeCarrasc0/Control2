package cl.tbd.proyecto.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import cl.tbd.proyecto.models.User;
//import java.sql.Date;

@Repository
public interface UserRepository {
    
    public List<User> getAllUsers();
    public User getUser(Integer id);
    public User createUser(User user);
    /*public User updateUser(Integer id, String nombre, String password, Date fecha);
    public Integer deleteVoluntario(Integer id);*/
}
