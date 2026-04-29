package ejemplo03_1;

public class SMSAdapter implements NotificacionPort {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }    
}
