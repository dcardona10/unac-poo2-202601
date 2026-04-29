package ejemplo03_1;

public class Main {
    
    public static void main(String[] args) {
        
        NotificacionService emailService = new NotificacionService(new EmailAdapter());
        NotificacionService smsService = new NotificacionService(new SMSAdapter());

        emailService.enviarNotificacion("Hola, este es un email!");
        smsService.enviarNotificacion("Hola, este es un SMS!");
    }
}
