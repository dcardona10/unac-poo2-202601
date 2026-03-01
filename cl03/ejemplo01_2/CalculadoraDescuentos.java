package ejemplo01_2;

public class CalculadoraDescuentos {

    private PoliticaDescuento politica;
    
    public CalculadoraDescuentos(PoliticaDescuento politica) {
        this.politica = politica;
    }

    public double calcular(double monto) {
        return politica.calcular(monto);
    }
}
