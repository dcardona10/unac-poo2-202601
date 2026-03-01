package ejemplo03_2;

public class MercadoPago implements MetodoPago {
    
    @Override
    public void procesar(double monto) {
        System.out.println("Procesando pago de " + monto + " con MercadoPago.");
    }
    
}
