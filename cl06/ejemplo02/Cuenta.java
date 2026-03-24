package ejemplo02;

public class Cuenta {
    
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void retirar(double monto) throws SaldoInsuficienteException {
        
        if (saldo >= monto) {
            System.out.println(Thread.currentThread().getName() + " retirando " + monto);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            saldo -= monto;
            System.out.println("Saldo restante: " + saldo);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para " + Thread.currentThread().getName());
        }
    }
}
