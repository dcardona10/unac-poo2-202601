package ejemplo03_1;

public class NotificacionService {
    
    private NotificacionPort port;

    public NotificacionService(NotificacionPort port) {
        this.port = port;
    }

    public void enviarNotificacion(String mensaje) {
        port.enviar(mensaje);
    }
}
