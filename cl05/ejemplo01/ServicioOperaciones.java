package ejemplo01;

public class ServicioOperaciones {

    private Operaciones operaciones;

    public ServicioOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }
    
    public double sumar(Operaciones operaciones) {
        return this.operaciones.getNumero1() + operaciones.getNumero2();
    }
    
    public double restar(Operaciones operaciones) {
        return this.operaciones.getNumero1() - operaciones.getNumero2();
    }
    
    public double multiplicar(Operaciones operaciones) {
        return this.operaciones.getNumero1() * operaciones.getNumero2();
    }
    
    public double dividir(Operaciones operaciones) throws DivisionPorCeroException {
        if (operaciones.getNumero2() == 0) {
            throw new DivisionPorCeroException("Error: No se puede dividir por cero.");
        } else {
            return this.operaciones.getNumero1() / operaciones.getNumero2();
        }
    }
}