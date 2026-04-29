package ejemplo01;

public class ReporteService {

    private PdfGenerator pdfGenerator;

    public ReporteService() {
        this.pdfGenerator = new PdfGenerator();
    }

    public void generarReporte() {
        pdfGenerator.generar();
    }
}