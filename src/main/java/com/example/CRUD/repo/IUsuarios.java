package com.example.CRUD.repo;

import com.example.CRUD.model.Usuarios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarios extends CrudRepository<Usuarios, Integer> {
    
}
