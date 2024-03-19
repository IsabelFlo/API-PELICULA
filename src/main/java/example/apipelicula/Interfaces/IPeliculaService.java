package example.apipelicula.Interfaces;

import java.util.List;
import java.util.Optional;

import example.apipelicula.entities.Pelicula;

public interface IPeliculaService {
    List<Pelicula> getAll();
    Optional<Pelicula> getOne(Integer id);
}
