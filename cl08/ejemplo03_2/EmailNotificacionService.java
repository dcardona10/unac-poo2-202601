package ejemplo03_2;

public class EmailNotificacionService implements NotificacionService {
    
    @Override
    public void enviarConfirmacion(String cliente) {
        System.out.println("Enviando correo a " + cliente);
    }
}
