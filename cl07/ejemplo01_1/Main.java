package ejemplo01_1;

public class Main {
    public static void main(String[] args) {

        new Thread(() -> {
            throw new RuntimeException("Error en el hilo");
        }).start();

        System.out.println("Fin del programa");
    }
}