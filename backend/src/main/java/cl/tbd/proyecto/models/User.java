package cl.tbd.proyecto.models;

public class User {
    private Integer user_id;
    private String name;
    private String password;
<<<<<<< HEAD
=======
    private Date fecha;
    private String mail;
>>>>>>> c4e537e39748ed736d4c53eb5d9fefc85fb36a3d


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
<<<<<<< HEAD
=======
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getMail(){
        return mail;
    }
>>>>>>> c4e537e39748ed736d4c53eb5d9fefc85fb36a3d

    public void setMail(String mail) {
        this.mail=mail;
    }

}
