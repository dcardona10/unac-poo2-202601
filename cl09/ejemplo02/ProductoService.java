package ejemplo02;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductoService {

    private JdbcTemplate jdbcTemplate;

    public void crearProducto(String nombre) {

        if (nombre.isEmpty()) {
            throw new RuntimeException("Nombre inválido");
        }

        jdbcTemplate.execute("INSERT INTO productos...");
    }
}
