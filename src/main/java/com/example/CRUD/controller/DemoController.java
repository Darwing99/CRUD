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



@Controller
@RequestMapping
public class DemoController {
    @Autowired
    private IPersonaService service;

      
        @GetMapping("/listar")
        public String listar( Model model) {
               List<Personas>personas=service.listar();
               model.addAttribute("persona", personas);
              return "index";

        }
        //Guardar registro

        @GetMapping("/new")
        public String agregar(Model model){
            model.addAttribute("persona",new Personas());

            return "insert";
        }
        @PostMapping("/save")
        public String save(@Valid Personas p, Model model){
            service.save(p);
            return "redirect:/listar";     
        }

        @GetMapping("/editar/{idPersona}")

        public String editar(@PathVariable int idPersona, Model model){
           Optional<Personas>persona=service.listarId(idPersona);
           model.addAttribute("persona", persona); 
           return "insert";

        }

        @GetMapping("/eliminar/{idPersona}")
        public String Eliminar(@PathVariable int idPersona,Model model){
            service.delete(idPersona);
            return "redirect:/listar";
        }
        



}
