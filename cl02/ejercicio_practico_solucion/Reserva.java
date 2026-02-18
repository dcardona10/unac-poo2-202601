package ejercicio_practico_solucion;

public class Reserva {

    private Cliente cliente;
    private double precio;

    public void aplicarDescuento(PoliticaDescuento politica) {
        precio = politica.calcular(precio, cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
