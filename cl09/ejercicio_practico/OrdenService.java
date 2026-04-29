package ejercicio_practico;

public class OrdenService {

    public void crearOrden(String cliente, double monto) {

        if (cliente == null) {
            throw new RuntimeException("Cliente requerido");
        }

        System.out.println("Guardando orden en MySQL...");
        System.out.println("Enviando confirmación por email...");
        System.out.println("Orden creada");
    }
}