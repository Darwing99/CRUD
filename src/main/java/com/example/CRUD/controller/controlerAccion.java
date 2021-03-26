package com.example.CRUD.controller;


import com.example.CRUD.interfaceService.IUsuariosService;
import com.example.CRUD.model.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class controlerAccion {
    @Autowired
    private IUsuariosService user;
    @GetMapping("/login")
    public ModelAndView modelAndView(){
        return new ModelAndView("administrador/login");
    }
    
    @GetMapping("/inicio")
    public ModelAndView Home(){
        return new ModelAndView("index");
    }


    @PostMapping("/admin")
    public ModelAndView getHome(){
        return new ModelAndView("administrador/admin");
    }
    @GetMapping("/admin")
    public ModelAndView getInicio(){
        return new ModelAndView("administrador/admin");
    }

    @GetMapping("/contact")
    public ModelAndView getContac(){
        return new ModelAndView("informativa/contact");
    }

    
    @GetMapping("/usuario")
    public ModelAndView agregarUser(Model model){
        model.addAttribute("usuario",new Usuarios());

        return new ModelAndView("administrador/usuarios");
    }
    @PostMapping("/saveUser")
    public ModelAndView saveUser(@Valid Usuarios u, Model model){
      user.save(u);
      return new ModelAndView("redirect:/usuario");   
    }

}
