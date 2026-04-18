package ejemplo02_2;

import java.util.List;

public class CompraService {
    
    private PagoService pagoService;
    private CompraRepository compraRepository;

    public CompraService(PagoService pagoService, CompraRepository compraRepository) {
        this.pagoService = pagoService;
        this.compraRepository = compraRepository;
    }

    public void comprar(List<String> productos, String tarjeta) {

        Compra compra = new Compra(productos);
        double total = compra.calcularTotal();

        pagoService.pagar(total, tarjeta);
        compraRepository.guardar(compra);
    }
}
