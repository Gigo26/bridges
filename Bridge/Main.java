package Bridge;

public class Main {

    public static void main(String[] args) {
        // Implementadores concretos
        Accion accionOfensiva = new AccionOfensiva();
        Accion accionDefensiva = new AccionDefensiva();

        // Abstracciones refinadas con implementadores concretos
        Jugador lebronJames = new JugadorNBA("LeBron James", accionOfensiva);
        Jugador kawhiLeonard = new JugadorNBA("Kawhi Leonard", accionDefensiva);

        // Usando las abstracciones refinadas
        lebronJames.jugar();
        kawhiLeonard.jugar();
    }
    
}
