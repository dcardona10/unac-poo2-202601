package ejemplo01_1;

public class UsuarioController {

    public void registrar(String nombre, String email) {

        // Validación
        if (email == null || !email.contains("@")) {
            System.out.println("Email inválido");
            return;
        }

        // Lógica de negocio
        if (nombre.length() < 3) {
            System.out.println("Nombre muy corto");
            return;
        }

        // Persistencia
        System.out.println("Conectando a MySQL...");
        System.out.println("INSERT INTO usuarios...");

        // Presentación
        System.out.println("Usuario registrado exitosamente");
    }
}