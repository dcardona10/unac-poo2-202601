package co.edu.unac.poo2.cl13.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    EstudianteService service;

    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Estudiante getEstudiantePorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                      .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return service.guardar(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante modificarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        Estudiante existente = service.buscarPorId(id)
                                      .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
        existente.setNombre(estudiante.getNombre());
        existente.setPrograma(estudiante.getPrograma());
        existente.setSemestre(estudiante.getSemestre());
        return service.guardar(existente);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id) {
        service.eliminar(id);
    }
}
