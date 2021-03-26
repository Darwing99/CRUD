package com.example.CRUD.model;

public class Login {

    private int Id;
    private String accion;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getAccion() {
        return accion;
    }
    public void setAccion(String accion) {
        this.accion = accion;
    }
    public Login(int id, String accion) {
        this.Id = id;
        this.accion = accion;
    }
    
    public Login(){

    }
  
   
}
