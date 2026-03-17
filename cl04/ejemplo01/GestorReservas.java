package ejemplo01;

public class GestorReservas {
    
    private RepositorioReservas repositorio;

    public GestorReservas(RepositorioReservas repositorio) {
        this.repositorio = repositorio;
    }

    public void reservar(Espacio espacio, Periodo periodo) {
        Reserva reserva = new Reserva(espacio, periodo);
        repositorio.guardar(reserva);
    }
}
