package ejercicio_practico.repository;

import java.util.List;

import ejercicio_practico.domain.Estudiante;

public interface EstudianteRepository {
    
    void guardar(Estudiante estudiante);

    List<Estudiante> buscarTodos();

    Estudiante buscarPorId(String id);
}
