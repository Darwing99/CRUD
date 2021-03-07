package com.example.CRUD.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.CRUD.model.Personas;

public interface IPersonaService {

    public List<Personas> listar();
    public Optional<Personas> listarId(int id);
    public int save(Personas p);
    public void delete(int id);
    
}
