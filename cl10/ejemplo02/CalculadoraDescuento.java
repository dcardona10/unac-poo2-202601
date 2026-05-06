package ejemplo02;

public class CalculadoraDescuento {
    
    public double aplicar(double total) {
        if (total > 100) {
            return total * 0.9;
        }
        return total;
    }

}
