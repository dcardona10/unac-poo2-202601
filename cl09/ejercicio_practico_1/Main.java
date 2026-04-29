package ejercicio_practico_1;

import ejercicio_practico_1.adapter.*;
import ejercicio_practico_1.port.*;

public class Main {
    
    public static void main(String[] args) {
        
        OrdenRepository mysqlRepository = new MySQLOrdenRepository();
        NotificacionPort emailPort = new EmailNotificacion();

        Orden orden = new Orden("Juan", 100);
        OrdenService ordenService = new OrdenService(mysqlRepository, emailPort);
        ordenService.crearOrden(orden);
    }
}
