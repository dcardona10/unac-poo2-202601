package ejemplo01_1;

public class PdfGenerator implements ReporteGenerator {
    
    @Override
    public void generar() {
        System.out.println("Generando reporte en formato PDF...");
    }
}
