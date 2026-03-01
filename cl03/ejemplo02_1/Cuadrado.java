package ejemplo02_1;

public class Cuadrado extends Rectangulo {
    
    public void setAncho(double ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

    public void setAlto(double alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }
}
