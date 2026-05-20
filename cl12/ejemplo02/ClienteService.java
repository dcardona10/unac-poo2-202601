package ejemplo02;

public class ClienteService {

    private ClienteRepository clienteRepository;
    
    public void guardar(Cliente cliente) {
        clienteRepository.guardar(cliente);
    }
}
