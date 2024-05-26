package Bridge;

public abstract class Jugador {
    protected Accion accion;

    public Jugador(Accion accion) {
        this.accion = accion;
    }

    abstract void jugar();
}
