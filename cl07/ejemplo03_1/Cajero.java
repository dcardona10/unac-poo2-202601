package ejemplo03_1;

public class Cajero implements Runnable {

    private Cuenta cuenta;

    public Cajero(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        cuenta.retirar(100.0); // puede lanzar excepción
    }
}