package ejemplo01_2;

public class MySQLUsuarioRepository implements UsuarioRepository {

    @Override
    public void guardar(Usuario usuario) {
        System.out.println("Guardando usuario en MySQL...");
    }
}
