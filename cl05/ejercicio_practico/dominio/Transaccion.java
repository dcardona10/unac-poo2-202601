package ejercicio_practico.dominio;

public class Transaccion {
    
    private String tipo;
    private Cuenta cuenta;
    private double monto;

    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
