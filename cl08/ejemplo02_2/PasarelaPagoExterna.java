package ejemplo02_2;

public class PasarelaPagoExterna implements PagoService {
    
    @Override
    public void pagar(double monto, String tarjeta) {
        System.out.println("Procesando pago de " + monto + " con tarjeta " + tarjeta);
    }
}
