package ejemplo01_1;

public class Main {
    
    public static void main(String[] args) {

        ReporteGenerator pdfGenerator = new PdfGenerator();
        ReporteGenerator excelGenerator = new ExcelGenerator();
        
        ReporteService reporteServicePdf = new ReporteService(pdfGenerator);
        ReporteService reporteServiceExcel = new ReporteService(excelGenerator);
        
        reporteServicePdf.generarReporte();
        reporteServiceExcel.generarReporte();
    }
}
