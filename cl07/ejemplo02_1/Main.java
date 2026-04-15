package ejemplo02_1;

public class Main {
    
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        try {
            cuenta.retirar(60);
        } catch (RuntimeException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
