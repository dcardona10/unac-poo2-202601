public class ItemPedido {
    private String id;
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    
    public ItemPedido() {
    }
    
    public ItemPedido(String id, Cliente cliente, Producto producto, int cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public String getId() {
        return id;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Producto getProducto() {
        return producto;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}