package ejemplo01_2;

public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {

        if (nombre.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }

        this.nombre = nombre;
        this.email = email;
    }
}
