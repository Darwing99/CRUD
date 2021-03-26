package com.example.CRUD.controller;
import java.util.List;
import java.util.Optional;


import com.example.CRUD.interfaceService.IPersonaService;

import com.example.CRUD.model.Personas;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class DemoController { 
    
   
     
    @Autowired
    private IPersonaService service;
      
        @GetMapping("/listar")
        public ModelAndView listar( Model model) {
               List<Personas>personas=service.listar();
               model.addAttribute("persona", personas);
               return new ModelAndView("administrador/listapersonas");

        }
       
        @GetMapping("/new")
        public ModelAndView agregar(Model model){
            model.addAttribute("persona",new Personas());

            return new ModelAndView("administrador/insert");
        }
        @PostMapping("/save")
        public ModelAndView save(@Valid Personas p, Model model){
            service.save(p);
            return new ModelAndView("redirect:/listar");   
        }

        @GetMapping("/editar/{idPersona}")

        public ModelAndView editar(@PathVariable int idPersona, Model model){
           Optional<Personas>persona=service.listarId(idPersona);
           model.addAttribute("persona", persona); 
           return new ModelAndView("administrador/insert");

        }

        @GetMapping("/eliminar/{idPersona}")
        public ModelAndView Eliminar(@PathVariable int idPersona,Model model){
            service.delete(idPersona);
            return new ModelAndView("redirect:/listar");
        }

       //guardando usuarios



}
