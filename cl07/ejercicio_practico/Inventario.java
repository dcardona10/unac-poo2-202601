package ejercicio_practico;

public class Inventario {

    private int stock = 10;

    public void procesarPedido(int cantidad) {

        if (stock >= cantidad) {

            System.out.println(Thread.currentThread().getName() + " procesando pedido");

            stock -= cantidad;

            // Simular error
            if (cantidad > 3) {
                throw new RuntimeException("Error procesando pedido");
            }

            System.out.println("Stock restante: " + stock);

        } else {
            System.out.println("Stock insuficiente");
        }
    }
}
