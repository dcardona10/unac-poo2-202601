package ejemplo02_1;

public class ProductoService {
    
    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void guardarProducto(Producto producto) {
        productoRepository.guardar(producto);
    }
}
