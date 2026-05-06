package ejemplo02;

import java.util.List;

public class Pedido {

    private String id;
    private List<String> productos;
    private double total;
    
    public Pedido(String id, List<String> productos, double total) {
        this.id = id;
        this.productos = productos;
        this.total = total;
    }

    private double calcularTotal() {
        return productos.size() * 10;
    }

    private void aplicarDescuento() {
        if (total > 100) {
            total *= 0.9;
        }
    }
}
