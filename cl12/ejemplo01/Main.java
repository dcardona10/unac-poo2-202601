package ejemplo01;

public class Main {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("David");
        System.out.println("Nombre del cliente: " + cliente.getNombre());
    }
}