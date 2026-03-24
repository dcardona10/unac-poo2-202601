package ejemplo01;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) {

        if (saldo >= monto) {
            System.out.println(Thread.currentThread().getName() + " retirando " + monto);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            saldo -= monto;
            System.out.println("Saldo restante: " + saldo);

        } else {
            System.out.println("Saldo insuficiente para " + Thread.currentThread().getName());
        }
    }

    public double getSaldo() {
        return saldo;
    }
}