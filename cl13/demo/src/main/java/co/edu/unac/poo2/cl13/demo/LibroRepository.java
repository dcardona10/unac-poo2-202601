package co.edu.unac.poo2.cl13.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findAll();

    Optional<Libro> findById(Long id);

    <S extends Libro> S save(S entity);

    void deleteById(Long id);

    long count();
}
