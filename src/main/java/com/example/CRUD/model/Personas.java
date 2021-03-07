package com.example.CRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="r_personas")
public class Personas {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idPersona;
    @Column(name="nombre",length = 50)
    private String nombre;
    private String celular;


    public Personas(int idPersona, String nombre, String celular) {
            this.idPersona = idPersona;
            this.nombre = nombre;
            this.celular = celular;
        }

        public Personas(){
            
        }

 
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    
}
