package ejercicio_practico_1;

public class Fecha {

    private String valor;

    private static final String FORMATO_FECHA = "^\\d{4}-\\d{2}-\\d{2}$";
    
    public Fecha(String valor) {
        if (!valor.matches(FORMATO_FECHA)) {
            throw new IllegalArgumentException("Formato de fecha inválido. Debe ser YYYY-MM-DD.");
        }
        this.valor = valor;
    }
}
