package com.example.CRUD.servicios;

import java.util.List;
import java.util.Optional;



import com.example.CRUD.interfaceService.IPersonaService;
import com.example.CRUD.model.Personas;
import com.example.CRUD.repo.IPersonas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
@Autowired
private IPersonas data;
    @Override
        public List<Personas> listar() {
          
            return (List<Personas>)data.findAll();
        }


    @Override
    public void delete(int id) {
        data.deleteById(id);
    }



  
    @Override
    public Optional<Personas> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Personas p) {
       int res=0;
       Personas persona=data.save(p);
       if(!persona.equals(null)){
           res=1;
       }
        return res;
    }
    
    
}
