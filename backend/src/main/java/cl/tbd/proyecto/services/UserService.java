package cl.tbd.proyecto.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import cl.tbd.proyecto.repositories.UserRepository;
import cl.tbd.proyecto.models.User;

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
}
