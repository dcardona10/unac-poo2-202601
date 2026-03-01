package ejemplo03_2;

public class PayPal implements MetodoPago {

    @Override
    public void procesar(double monto) {
        System.out.println("Procesando pago de " + monto + " a través de PayPal.");
    }    
}
