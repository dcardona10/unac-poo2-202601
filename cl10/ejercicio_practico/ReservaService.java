package ejercicio_practico;

public class ReservaService {
    
    public void reservar(String cliente, String fecha) {

        if (cliente == null) {
            throw new IllegalArgumentException("Cliente requerido.");
        }

        System.out.println("Reserva creada para " + cliente);
    }
}
