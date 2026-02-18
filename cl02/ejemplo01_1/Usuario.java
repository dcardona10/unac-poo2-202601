package ejemplo01_1;

public class Usuario {

    private String nombre;
    private String email;
    private String contrasena;

    public boolean autenticar(String email, String contrasena) {
        return this.email.equals(email) && this.contrasena.equals(contrasena);
    }

    public void enviarCorreo(String mensaje) {
        System.out.println("Enviando correo a " + email);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando usuario...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}