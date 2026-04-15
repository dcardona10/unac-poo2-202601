package ejercicio_practico_s;

public class Pedido implements Runnable {
    
    private Inventario inventario;
    private int cantidad;

    public Pedido(Inventario inventario, int cantidad) {
        this.inventario = inventario;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        try {
            inventario.procesarPedido(cantidad);
        } catch (StockInsuficienteException e) {
            System.out.println("Error de negocio: " + e.getCause() + " - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de sistema: " + e.getCause() + " - " + e.getMessage());
        }
    }
}
