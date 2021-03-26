package com.example.CRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="r_usuarios")
public class Usuarios {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre",length = 50)
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
   

    public Usuarios(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password =(password);
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

  

    public Usuarios(int id, String nombre, String apellido, String correo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
      
    }

   


    
}
