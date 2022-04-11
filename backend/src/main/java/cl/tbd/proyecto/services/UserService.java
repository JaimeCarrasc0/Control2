package cl.tbd.proyecto.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import cl.tbd.proyecto.repositories.UserRepository;
import cl.tbd.proyecto.models.User;

@CrossOrigin
@RestController
public class UserService {
    private final UserRepository userRepository;
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return userRepository.getUser(id);
    }

    @PostMapping("/user")
    @ResponseBody
    public User createUser(@RequestBody User user){
       User result = userRepository.createUser(user);
       return result;
    }
}
