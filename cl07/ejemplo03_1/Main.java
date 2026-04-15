package ejemplo03_1;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {

        Cuenta cuenta = new Cuenta();
        Cajero cajero1 = new Cajero(cuenta);

        Thread hilo1 = new Thread(cajero1);
        Thread hilo2 = new Thread(cajero1);

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
