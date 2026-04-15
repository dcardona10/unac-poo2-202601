package ejemplo01_2;

public class Main {
    
    public static void main(String[] args) {
        
        new Thread(() -> {
            try {
                procesar();
            } catch (Exception e) {
                manejarError(e);
            }
        }).start();

        System.out.println("Fin del programa.");
    }

    public static void procesar() {
        throw new RuntimeException("Error en el hilo.");
    }

    public static void manejarError(Exception e) {
        System.out.println("Error capturado: " + e.getMessage());
    }
}
