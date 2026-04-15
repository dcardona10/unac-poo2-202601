package ejemplo03_2;

public class Cajero implements Runnable {
    
    private Cuenta cuenta;

    public Cajero(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        try {
            cuenta.retirar(100.0);
        } catch (Exception e) {
            //System.out.println(Thread.currentThread().getName() + ":" + e.getMessage());
            ErrorHandler.manejarError(e, Thread.currentThread().getName());
        }
    }
}
