package ejemplo01;

public class Reserva {
    private Espacio espacio;
    private Periodo periodo;

    public Reserva(Espacio espacio, Periodo periodo) {
        this.espacio = espacio;
        this.periodo = periodo;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
