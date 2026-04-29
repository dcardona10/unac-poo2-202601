package ejemplo00;

public class PedidoService {
    
    private MySQLPedidoRepository repository;

    public PedidoService() {
        this.repository = new MySQLPedidoRepository();
    }

    public void crearPedido(List<String> productos) {
        Pedido pedido = new Pedido(productos);
        repository.guardar(pedido);
    }
}
