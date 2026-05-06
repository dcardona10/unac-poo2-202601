package ejemplo02;

public class Email {

    private String direccionEmail;

    public Email(String direccionEmail) {
        if (!direccionEmail.contains("@")) {
            throw new IllegalArgumentException("Dirección de correo inválida: " + direccionEmail);
        }
        this.direccionEmail = direccionEmail;
    }

    public String getDireccionEmail() {
        return direccionEmail;
    }
}
