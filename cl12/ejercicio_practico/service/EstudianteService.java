package ejercicio_practico.service;

import java.util.List;

import ejercicio_practico.domain.Estudiante;
import ejercicio_practico.repository.EstudianteRepository;

public class EstudianteService {
    
    private EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepository.guardar(estudiante);
    }

    public List<Estudiante> buscarTodosEstudiantes() {
        return estudianteRepository.buscarTodos();
    }

    public Estudiante buscarEstudiantePorId(String id) {
        return estudianteRepository.buscarPorId(id);
    }
}
