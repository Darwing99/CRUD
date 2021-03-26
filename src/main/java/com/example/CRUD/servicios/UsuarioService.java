package com.example.CRUD.servicios;

import java.util.List;
import java.util.Optional;

import com.example.CRUD.interfaceService.IUsuariosService;
import com.example.CRUD.model.Usuarios;
import com.example.CRUD.repo.IUsuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuariosService {
    @Autowired
private IUsuarios data;
//metodo para listar usuarios
    @Override
        public List<Usuarios>listar() {
          
            return (List<Usuarios>)data.findAll();
        }



    //metodo para borrar usuarios por id    
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }



  ///metodo para actualizar usuarios
    @Override
    public Optional<Usuarios> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Usuarios u) {
       int res=0;
       Usuarios usuario=data.save(u);
       if(!usuario.equals(null)){
           res=1;
       }
        return res;
    }
    
}
