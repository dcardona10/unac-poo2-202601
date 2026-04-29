package ejemplo01_1;

public class ReporteService {
    
    private ReporteGenerator generator;

    public ReporteService(ReporteGenerator generator) {
        this.generator = generator;
    }

    public void generarReporte() {
        generator.generar();
    }
}
