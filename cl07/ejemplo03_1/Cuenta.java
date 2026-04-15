package ejemplo03_1;

public class Cuenta {

    private double saldo = 100.0;

    public void retirar(double monto) {

        if (monto > 50) {
            throw new RuntimeException("Error después del retiro");
        }

        saldo -= monto; // se modifica el estado
    }

    public double getSaldo() {
        return saldo;
    }
}