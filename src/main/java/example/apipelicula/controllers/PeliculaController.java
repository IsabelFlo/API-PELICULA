package example.apipelicula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.apipelicula.entities.Pelicula;
import example.apipelicula.services.PeliculaService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/peliculas")
@RestController
public class PeliculaController {

    final PeliculaService peliculaService;

    PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping("/")
    List<Pelicula> getAll() {
        return peliculaService.getAll();
    }

    @GetMapping("/{id}")
    Optional<Pelicula> getOne(@PathVariable Integer id) {
        return peliculaService.getOne(id);
    }
    
}
