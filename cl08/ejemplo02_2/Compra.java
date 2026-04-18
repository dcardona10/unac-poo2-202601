package ejemplo02_2;

import java.util.List;

public class Compra {
    
    public List<String> productos;

    public Compra(List<String> productos) {

        if(productos.isEmpty()) {
            throw new IllegalArgumentException("La lista de productos no puede estar vacía");
        }
        this.productos = productos;
    }

    public double calcularTotal() {
        return productos.size() * 10.0;
    }
}
