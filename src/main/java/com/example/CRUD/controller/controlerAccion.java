package com.example.CRUD.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class controlerAccion {

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
}
