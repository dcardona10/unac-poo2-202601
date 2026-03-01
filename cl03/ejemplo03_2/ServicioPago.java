package ejemplo03_2;

public class ServicioPago {
    
    private MetodoPago metodo;

    public ServicioPago(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void pagar(double monto) {
        metodo.procesar(monto);
    }
}
