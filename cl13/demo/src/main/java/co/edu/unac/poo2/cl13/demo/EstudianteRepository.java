package co.edu.unac.poo2.cl13.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    
    List<Estudiante> findAll();

    Optional<Estudiante> findById(Long id);

    <S extends Estudiante> S save(S entity);

    void deleteById(Long id);
}
