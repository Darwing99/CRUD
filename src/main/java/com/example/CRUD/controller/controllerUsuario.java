package com.example.CRUD.controller;

import com.example.CRUD.config.Paginas;
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
public class controllerUsuario {
    @Autowired
    private IUsuariosService user;
    @GetMapping("/usuario")
    public ModelAndView agregarUser(Model model){
        model.addAttribute("usuario",new Usuarios());

        return new ModelAndView(Paginas.USER);
    }
    @PostMapping("/saveUser")
    public ModelAndView saveUser(@Valid Usuarios u, Model model){
      user.save(u);
      return new ModelAndView("redirect:/usuario");   
    }
}
