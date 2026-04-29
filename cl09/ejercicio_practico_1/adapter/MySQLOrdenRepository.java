package ejercicio_practico_1.adapter;

import ejercicio_practico_1.*;
import ejercicio_practico_1.port.*;

public class MySQLOrdenRepository implements OrdenRepository {
    @Override
    public void guardar(Orden orden) {

        System.out.println("Guardando orden en MySQL: " + orden.getCliente() + " - " + orden.getMonto());
    }
}
