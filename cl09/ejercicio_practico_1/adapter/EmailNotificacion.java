package ejercicio_practico_1.adapter;

import ejercicio_practico_1.port.*;

public class EmailNotificacion implements NotificacionPort {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por email: " + mensaje);
    }
}
