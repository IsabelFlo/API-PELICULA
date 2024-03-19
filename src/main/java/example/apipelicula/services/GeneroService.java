package example.apipelicula.services;

import java.util.List;

import org.springframework.stereotype.Service;

import example.apipelicula.Interfaces.IGeneroService;
import example.apipelicula.entities.Genero;
import example.apipelicula.repository.GeneroRepository;

@Service
public class GeneroService implements IGeneroService {

    final GeneroRepository generoRepo;

    public GeneroService(GeneroRepository generoRepo) {
        this.generoRepo = generoRepo;
    }

    @Override
    public List<Genero> getAll() {   
        return generoRepo.findAll();
    }

}
