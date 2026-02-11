import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private List<ItemPedido> itemsPedido;
    private double subtotal;
    private double total;
    
    public Pedido() {
        this.itemsPedido = new ArrayList<>();
    }
    
    public Pedido(String id, List<ItemPedido> itemsPedido, double subtotal, double total) {
        this.id = id;
        this.itemsPedido = itemsPedido != null ? itemsPedido : new ArrayList<>();
        this.subtotal = subtotal;
        this.total = total;
    }
    
    public String getId() {
        return id;
    }
    
    public List<ItemPedido> getItemsPedido() {
        return itemsPedido;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setItemsPedido(List<ItemPedido> itemsPedido) {
        this.itemsPedido = itemsPedido;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public void agregarItem(ItemPedido item) {
        this.itemsPedido.add(item);
    }
    
    public void calcularSubtotal() {
        this.subtotal = 0;
        for (ItemPedido item : itemsPedido) {
            this.subtotal += item.calcularSubtotal();
        }
    }
    
    public void calcularTotal() {
        calcularSubtotal();
        this.total = this.subtotal; // Aquí podrías agregar impuestos o descuentos
    }
}