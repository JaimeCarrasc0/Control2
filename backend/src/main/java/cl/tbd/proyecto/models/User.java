package cl.tbd.proyecto.models;

import java.sql.Date;

public class User {
    private Integer user_id;
    private String name;
    private String password;
    private Date fecha;
    private String mail;


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
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getMail(){
        return mail;
    }

    public void setMail(String mail) {
        this.mail=mail;
    }

}
