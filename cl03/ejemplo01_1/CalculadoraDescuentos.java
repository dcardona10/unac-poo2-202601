public class CalculadoraDescuentos {
    
    public double calcular(String tipoCliente, double monto) {

        if (tipoCliente.equals("VIP")) {
            return monto * 0.8;
        }

        if (tipoCliente.equals("Regular")) {
            return monto * 0.95;
        }

        return monto;
    }
}