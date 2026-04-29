package ejercicio_practico_1;

import ejercicio_practico_1.port.*;

public class OrdenService {
    
    private OrdenRepository repository;
    private NotificacionPort port;

    public OrdenService(OrdenRepository repository, NotificacionPort port) {
        this.repository = repository;
        this.port = port;
    }

    public void crearOrden(Orden orden) {
        repository.guardar(orden);
        port.enviar("Orden creada para: " + orden.getCliente());
    }
}
