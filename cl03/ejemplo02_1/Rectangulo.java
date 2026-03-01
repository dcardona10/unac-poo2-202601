package ejemplo02_1;

public class Rectangulo {
    
    protected double ancho;
    protected double alto;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}
