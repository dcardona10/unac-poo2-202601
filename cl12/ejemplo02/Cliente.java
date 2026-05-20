package ejemplo02;

public class Cliente {
    
    private String id;
    private String nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}
