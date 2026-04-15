package ejemplo02_2;

public class Main {
    
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        try {
            cuenta.retirar1(60.0);
        } catch (Exception e1) {
            System.out.println("Error al retirar: " + e1.getMessage());
        }

        System.out.println("El saldo es de: " + cuenta.getSaldo());
    }
}
