package ejemplo02;

public class Main {

    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(5000);
        Thread usuario1 = new Thread(new Cajero(cuenta, 5000), "Usuario 1");
        Thread usuario2 = new Thread(new Cajero(cuenta, 5000), "Usuario 2");

        usuario1.start();
        usuario2.start();
    }
}
