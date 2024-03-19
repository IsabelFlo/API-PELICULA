package example.apipelicula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.apipelicula.entities.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

}