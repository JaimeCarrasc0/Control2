package cl.tbd.proyecto.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;
import cl.tbd.proyecto.models.Dog;

@Repository
public class DogRepositoryImp implements DogRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public int countDogs() {
        int total = 0;
        String sql = "SELECT COUNT(*) FROM dog";
        try(Connection conn = sql2o.open()){
            total = conn.createQuery(sql).executeScalar(Integer.class);
        }
        return total;
    }

    @Override
    public List<Dog> showDogs(){
        String sql = "SELECT * FROM dog";
        try(Connection conn = sql2o.open()){
            List<Dog> dogs = conn.createQuery(sql).executeAndFetch(Dog.class);
            return dogs;
        }
    }

}