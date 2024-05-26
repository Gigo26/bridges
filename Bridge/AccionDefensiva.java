package Bridge;

public class AccionDefensiva implements Accion {
    @Override
    public void realizarAccion() {
        System.out.println("Realizando una jugada defensiva...");
    }
}