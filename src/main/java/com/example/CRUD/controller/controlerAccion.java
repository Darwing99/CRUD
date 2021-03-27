package com.example.CRUD.controller;


import com.example.CRUD.config.Paginas;
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
        return new ModelAndView(Paginas.LOGIN);
    }
    
    @GetMapping("/inicio")
    public ModelAndView Home(){
        return new ModelAndView(Paginas.HOME);
    }


    @GetMapping("/admin")
    public ModelAndView getHome(){
        return new ModelAndView(Paginas.ADMIN);
    }
    @PostMapping("/admin")
    public ModelAndView getInicio(){
        return new ModelAndView(Paginas.ADMIN);
    }

    @PostMapping("/contact")
    public ModelAndView getContac(){
        return new ModelAndView("informativa/contact");
    }
    
}
