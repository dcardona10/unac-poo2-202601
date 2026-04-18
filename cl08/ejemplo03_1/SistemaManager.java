package ejemplo03_1;

import java.util.List;

public class SistemaManager {

    public void procesarPedido(String cliente, List<String> productos) {

        // Validaciones
        if (cliente == null) {
            throw new RuntimeException("Cliente requerido");
        }

        // Lógica de negocio
        double total = productos.size() * 20;

        // Persistencia
        System.out.println("Guardando pedido...");

        // Notificación
        System.out.println("Enviando correo...");

        // UI
        System.out.println("Pedido procesado");
    }
}