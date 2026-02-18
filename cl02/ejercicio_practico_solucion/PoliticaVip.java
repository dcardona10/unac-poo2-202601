package ejercicio_practico_solucion;

public class PoliticaVip implements PoliticaDescuento {

    @Override
    public double calcular(double precio, Cliente cliente) {
        return cliente.isVip() ? precio * 0.8 : precio;
    }    
}
