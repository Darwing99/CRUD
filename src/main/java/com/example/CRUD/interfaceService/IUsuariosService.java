package com.example.CRUD.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.CRUD.model.Usuarios;

public interface IUsuariosService {
    public List<Usuarios> listar();
    public Optional<Usuarios> listarId(int id);
    public int save(Usuarios u);
    public void delete(int id);
    
}
