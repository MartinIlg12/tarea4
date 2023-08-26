package com.itsqmet.Taller4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String home(){
        return"home";
    }
    @GetMapping("/catalogo")
    public String catalogo(){
        return"catalogo";
    }
    @GetMapping("/playlist")
    public String playlist(){
        return"playlist";
    }
    @GetMapping("/ultimo")
    public String ultimo(){
        return"ultimo";
    }
    @GetMapping("/descargas")
    public String descargas(){
        return"descargas";
    }
}
