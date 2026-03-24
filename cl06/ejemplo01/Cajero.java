package ejemplo01;

public class Cajero implements Runnable {

    private Cuenta cuenta;
    private double monto;

    public Cajero(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void run() {
        cuenta.retirar(this.monto);
    }
}