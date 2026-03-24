package ejemplo02;

public class Cajero extends Thread {

    private Cuenta cuenta;
    private double monto;

    public Cajero(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void run() {
        try {
            cuenta.retirar(monto);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
