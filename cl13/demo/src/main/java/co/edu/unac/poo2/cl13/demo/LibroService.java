package co.edu.unac.poo2.cl13.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    
    @Autowired
    LibroRepository repo;

    public Libro guardar(Libro libro) {
        return repo.save(libro);
    }

    public List<Libro> listar() {
        return repo.findAll();
    }

    public Optional<Libro> buscarPorId(Long id) {
        return repo.findById(id);
    }
}
