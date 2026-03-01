package ejemplo03_1;

public class ServicioPago {
    
    private PayPal pago = new PayPal();

    public void pagar(double monto) {
        pago.procesar(monto);
    }
}
