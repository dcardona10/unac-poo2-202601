package ejemplo01_2;

public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void guardarUsuario(String nombre, String email) {
        Usuario usuario = new Usuario(nombre, email);
        usuarioRepository.guardar(usuario);
    }
}
