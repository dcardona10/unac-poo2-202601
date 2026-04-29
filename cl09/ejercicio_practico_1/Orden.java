package ejercicio_practico_1;

public class Orden {
    
    private String cliente;
    private double monto;

    public Orden(String cliente, double monto) {
        if (cliente == null) {
            throw new IllegalArgumentException("El nombre del cliente es requerido.");
        }
        this.cliente = cliente;
        this.monto = monto;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }
}
