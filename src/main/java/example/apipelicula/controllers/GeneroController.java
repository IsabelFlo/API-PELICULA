package example.apipelicula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.apipelicula.entities.Genero;
import example.apipelicula.services.GeneroService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/genero")
@RestController
public class GeneroController {

    final GeneroService generoService;

    GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping("/")
    List<Genero> getAll() {
        return generoService.getAll();
    }
    
}
