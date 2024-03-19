package example.apipelicula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import example.apipelicula.Interfaces.IPeliculaService;
import example.apipelicula.entities.Pelicula;
import example.apipelicula.repository.PeliculaRepository;

@Service
public class PeliculaService implements IPeliculaService {

    final PeliculaRepository peliculaRepo;

    
    public PeliculaService(PeliculaRepository peliculaRepo) {
        this.peliculaRepo = peliculaRepo;
    }

    @Override
    public List<Pelicula> getAll() {   
        return peliculaRepo.findAll();
    }

    @Override
    public Optional<Pelicula> getOne(Integer id) {
        return peliculaRepo.findById(id);
    }   

}
