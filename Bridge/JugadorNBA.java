package Bridge;

public class JugadorNBA extends Jugador {
    private String nombreJugador;

    public JugadorNBA(String nombreJugador, Accion accion) {
        super(accion);
        this.nombreJugador = nombreJugador;
    }

    @Override
    void jugar() {
        System.out.print(nombreJugador + " ");
        accion.realizarAccion();
    }
}
