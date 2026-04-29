package ejemplo03_1;

public class EmailAdapter implements NotificacionPort {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}
