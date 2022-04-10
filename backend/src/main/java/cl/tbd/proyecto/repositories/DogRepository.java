package cl.tbd.proyecto.repositories;

import org.springframework.stereotype.Repository;
import cl.tbd.proyecto.models.Dog;
import java.util.List;

@Repository
public interface DogRepository {
    public int countDogs();

    public List<Dog> showDogs();

}
