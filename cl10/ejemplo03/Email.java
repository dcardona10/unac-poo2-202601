package ejemplo03;

public class Email {
    
    private String valor;

    public Email(String valor) {
        if (!valor.contains("@")) {
            throw new IllegalArgumentException("Dirección de correo inválida.");
        }
        this.valor = valor;
    }
}
