package ejemplo01_2;

public class DescuentoBlackFriday implements PoliticaDescuento {
    
    @Override
    public double calcular(double monto) {
        return monto * 0.75;
    }
}
