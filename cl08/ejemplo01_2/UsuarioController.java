package ejemplo01_2;

public class UsuarioController {
    
    private UsuarioService usuarioService;

    public void guardarUsuario(String nombre, String email) {
        usuarioService.guardarUsuario(nombre, email);
        System.out.println("Usuario registrado: " + nombre);
    }
}
