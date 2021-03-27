package com.example.CRUD.controller;


import com.example.CRUD.config.Paginas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping
public class controlerAccion {
  


    @GetMapping("/login")
    // public ModelAndView modelAndView(){
    //     return new ModelAndView(Paginas.LOGIN);
    // }
    public String Login(Model model){
      
        return "administrador/login";
    }
    
    // @GetMapping("/inicio")
    // public ModelAndView Home(){
    //     return new ModelAndView(Paginas.HOME);
    // }
    @GetMapping("/inicio")
    public String Home(){
        return "index";
    }


    // @GetMapping("/admin")
    // public ModelAndView getHome(){
    //     return new ModelAndView(Paginas.ADMIN);
    // }

    @GetMapping("/admin")

    public String Admin(){
        return "administrador/admin";
    }

    @PostMapping("/admin")
    // public ModelAndView getInicio(){
    //     return new ModelAndView(Paginas.ADMIN);
    // }
    public String Admin1(){
        return "administrador/admin";
    }


  

    

}
