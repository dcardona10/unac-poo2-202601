import ejemplo03_2.*;

public class Main {
    
    public static void main(String[] args) {
        
        ServicioPago servicio = new ServicioPago(new PayPal());
        double monto = 1000000.0;
        servicio.pagar(monto);

        servicio = new ServicioPago(new MercadoPago());
        monto = 750000.0;
        servicio.pagar(monto);
    }
}
