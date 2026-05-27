package co.edu.unac.poo2.cl13.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    
    @Autowired
    private EstudianteRepository repo;

    public List<Estudiante> listar() {
        return repo.findAll();
    }

    public Optional<Estudiante> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public Estudiante guardar(Estudiante estudiante) {
        return repo.save(estudiante);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
