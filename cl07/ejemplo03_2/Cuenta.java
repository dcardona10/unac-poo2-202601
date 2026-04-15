package ejemplo03_2;

public class Cuenta {
    
    private double saldo = 100;

    public void retirar(double monto) {
        if (monto > 50.0) {
            throw new RuntimeException("Error: saldo insuficiente");
        }

        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
