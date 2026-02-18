package ejercicio_practico;

public class Reserva {

    private String cliente;
    private double precio;

    public void calcularDescuento() {
        if (cliente.equals("VIP")) {
            precio *= 0.8;
        }
    }

    public void enviarConfirmacion() {
        System.out.println("Enviando confirmación...");
    }
}