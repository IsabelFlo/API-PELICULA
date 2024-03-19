package example.apipelicula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.apipelicula.entities.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}