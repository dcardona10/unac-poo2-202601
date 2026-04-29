package ejemplo02_1;

public class MySQLProductoRepository implements ProductoRepository {
    
    @Override
    public void guardar(Producto producto) {
        System.out.println("Guardando producto en MySQL: " + producto.getNombre());
    }
}
