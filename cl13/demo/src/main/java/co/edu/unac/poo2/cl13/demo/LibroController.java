package co.edu.unac.poo2.cl13.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private LibroService service;
    
    @GetMapping
    public List<Libro> getLibros() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Libro getLibroPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                      .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return service.guardar(libro);
    }
}
