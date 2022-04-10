package cl.tbd.proyecto.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import cl.tbd.proyecto.repositories.DogRepository;
import cl.tbd.proyecto.models.Dog;

@CrossOrigin
@RestController
public class DogService {
    private final DogRepository dogRepository;
    DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }
    
    @GetMapping("/dogs/count")
    public String countDogs() {
        int total = dogRepository.countDogs();
        return "Tienes " + total + " perros en la base de datos.";
    }

    @GetMapping("/dogs/show")
    public String showDogs() {
        List<Dog> dogs = dogRepository.showDogs();
        String result = "";
        for (Dog dog : dogs) {
            result += dog.getName() + "\n";
        }
        return "Tus perros son: " + result;
    }

    @GetMapping("/dogs")
    public List<Dog> getDogs() {
        return dogRepository.showDogs();
    }
}
