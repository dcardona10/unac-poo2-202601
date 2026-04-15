package ejemplo02_1;

public class Cuenta {

    private int saldo = 100;

    public void retirar(int monto) {

        saldo -= monto; // se modifica el estado

        if (monto > 50) {
            throw new RuntimeException("Error después del retiro");
        }
    }

    public int getSaldo() {
        return saldo;
    }
}