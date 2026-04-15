package ejemplo02_2;

public class Cuenta {
    
    private double saldo = 100.0;

    public void retirar1(double monto) {

        if (monto > 50.0) {
            throw new RuntimeException("Error antes de modificar estado.");
        }

        saldo -= monto;
    }

    public void retirar2(double monto) {

        double saldoAnterior = saldo;

        try {
            saldo -= monto;
            if (monto > 50.0) {
                throw new RuntimeException("Error después de modificar estado.");
            }
        } catch (Exception e) {
            saldo = saldoAnterior;
            throw e;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
