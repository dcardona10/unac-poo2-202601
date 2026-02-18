package ejemplo02_2;

public class Pedido {

    private RepositorioPedido repositorio;

    public Pedido(RepositorioPedido repositorio) {
        this.repositorio = repositorio;
    }

    public void procesar() {
        repositorio.guardar("Pedido procesado");
    }
}

