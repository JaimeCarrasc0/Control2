package cl.tbd.proyecto.services;

import org.springframework.web.bind.annotation.*;

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
    
    @GetMapping("/user/all")
    @ResponseBody
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable Integer id) {
        return userRepository.getUser(id);
    }

    @PostMapping("/user/create")
    @ResponseBody
    public User createUser(@RequestBody User user){
       User result = userRepository.createUser(user);
       return result;
    }

    @PutMapping("/user/update/{id}")
    @ResponseBody
    public String updateUser(@PathVariable Integer id, @RequestBody User newUser){
        User user = userRepository.getUser(id);
        if(user == null){
            return "User not found";
        }
        else{
            newUser.setUser_id(id);
            if(newUser.getName() == null){
                newUser.setName(user.getName());
            }
            if(newUser.getPassword() == null){
                newUser.setPassword(user.getPassword());
            }
            if(newUser.getFecha() == null){
                newUser.setFecha(user.getFecha());
            }
        }
        User result = userRepository.updateUser(newUser);
        if(result == null){
            return "User not found";
        }
        else{
            return "Se actualizo el usuario";
        }
    }

    @DeleteMapping("/user/delete/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable Integer id){
        User user = userRepository.getUser(id);
        if(user == null){
            return "User not found";
        }
        else{
            userRepository.deleteUser(id);
            return "User deleted";
        }
    }
}
