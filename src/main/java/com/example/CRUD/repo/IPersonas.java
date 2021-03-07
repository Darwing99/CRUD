package com.example.CRUD.repo;

import com.example.CRUD.model.Personas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonas extends CrudRepository<Personas, Integer> {
    
}
