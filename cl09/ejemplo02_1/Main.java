package ejemplo02_1;

public class Main {
    
    public static void main(String[] args) {
        
        ProductoRepository productoRepository = new MySQLProductoRepository();
        ProductoService productoService = new ProductoService(productoRepository);
        
        Producto producto = new Producto("Laptop");
        productoService.guardarProducto(producto);
    }
}
