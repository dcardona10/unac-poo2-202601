package ejemplo01_2;

public class ServicioAutenticacion {
    
    public boolean autenticar(Usuario usuario, String email, String contrasena) {
        return usuario.coincideConCredenciales(email, contrasena);
    }
}
