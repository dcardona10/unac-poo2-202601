package ejemplo01_2;

public class DescuentoRegular implements PoliticaDescuento {
    
    @Override
    public double calcular(double monto) {
        return monto * 0.95;
    }
}
