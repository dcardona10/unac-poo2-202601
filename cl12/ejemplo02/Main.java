package ejemplo02;

public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("1234", "Juan Perez");
        ClienteRepository repo = new MySqlClienteRepository();
        repo.guardar(cliente);
    }
}
