package ejercicio_practico_1;

public class Reserva {

    private String cliente;
    private Fecha fecha;
    
    public Reserva(String cliente, Fecha fecha) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        this.cliente = cliente;
        this.fecha = fecha;
        NotificacionService.enviarNotificacion("Reserva creada para " + cliente + " en la fecha " + fecha);
    }
}
