package ejercicio_practico_s;

public class Main {
    
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Thread t1 = new Thread(new Pedido(inventario, 15), "Usuario 1");
        Thread t2 = new Thread(new Pedido(inventario, 30), "Usuario 2");

        t1.start();
        t2.start();
    }
}
