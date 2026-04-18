package ejemplo02_1;

import java.util.List;

public class CompraService {

    public void comprar(List<String> productos, String tarjeta) {

        if (productos.isEmpty()) {
            throw new RuntimeException("Carrito vacío");
        }

        // Calcular total
        double total = productos.size() * 10;

        // Pago
        System.out.println("Conectando con pasarela de pago...");
        System.out.println("Pagando: " + total);

        // Guardar
        System.out.println("Guardando compra en DB");

        // UI
        System.out.println("Compra exitosa");
    }
}