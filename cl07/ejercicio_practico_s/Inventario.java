package ejercicio_practico_s;

public class Inventario {
    
    private int stock = 100;

    public synchronized void procesarPedido(int cantidad) throws StockInsuficienteException {

        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida:");
        }

        if (stock < cantidad) {
            throw new StockInsuficienteException("Stock insuficiente."); 
        }

        System.out.println(Thread.currentThread().getName() + " procesando pedido.");

        int stockAnterior = stock;

        try {
            if (cantidad > 20) {
                throw new RuntimeException("Error procesando pedido.");
            }
            stock -= cantidad;
            System.out.println("Stock restante: " + stock);
        } catch (Exception e) {
            stock = stockAnterior; 
            throw e;
        }
    }
}
