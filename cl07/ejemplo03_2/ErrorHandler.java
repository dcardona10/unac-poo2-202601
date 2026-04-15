package ejemplo03_2;

public class ErrorHandler {
    
    public static void manejarError(Exception e, String hilo) {
        System.out.println("Error en" + hilo + ":" + e.getMessage());
    }
}
