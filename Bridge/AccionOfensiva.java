package Bridge;

public class AccionOfensiva implements Accion {
    @Override
    public void realizarAccion() {
        System.out.println("Realizando una jugada ofensiva...");
    }
}