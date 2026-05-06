public class PedidoService {
    
    public void aplicarDescuento(Pedido pedido) {
        if (pedido.getTotal() > 100) {
            double descuento = pedido.getTotal() * 0.1;
            pedido.setTotal(pedido.getTotal() - descuento);
        }
    }
}