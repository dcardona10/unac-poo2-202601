package ejemplo01_1;

public class ExcelGenerator implements ReporteGenerator {
    
    @Override
    public void generar() {
        System.out.println("Generando reporte en formato Excel...");
    }
}
