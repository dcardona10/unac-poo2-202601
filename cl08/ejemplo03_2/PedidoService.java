package ejemplo03_2;

import java.util.List;

public class PedidoService {
    
    private PedidoRepository pedidoRepository;
    private NotificacionService notificacionService;

    public PedidoService(PedidoRepository pedidoRepository, NotificacionService notificacionService) {
        this.pedidoRepository = pedidoRepository;
        this.notificacionService = notificacionService;
    }

    public void procesarPedido(String cliente, List<String> productos) {
        Pedido pedido = new Pedido(cliente, productos);
        pedidoRepository.guardar(pedido);
        notificacionService.enviarConfirmacion(cliente);
    }
}
