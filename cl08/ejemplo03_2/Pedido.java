package ejemplo03_2;

import java.util.List;

public class Pedido {
    
    private String cliente;
    private List<String> productos;

    public Pedido(String cliente, List<String> productos) {

        if (cliente == null) {
            throw new IllegalArgumentException("Cliente requerido");
        }
        this.cliente = cliente;
        this.productos = productos;
    }

    public double calcularTotal() {
        return productos.size() * 20;
    }
}
