package cl.tbd.proyecto.models;

public class Dog {
    private Long dog_id;
    private String name;

    public Dog(Long dog_id, String name) {
        this.dog_id = dog_id;
        this.name = name;
    }

    public Long getDog_id() {
        return dog_id;
    }

    public void setDog_id(Long dog_id) {
        this.dog_id = dog_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
