package ejemplo02_1;

public class Producto {
    
    private String nombre;

    public Producto(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
