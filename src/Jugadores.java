import java.util.Scanner;

public class Jugadores {

    Scanner sc = new Scanner(System.in);
    private static Jugadores jugadores;
    private int personas;
    private Jugador[] jugador;
    private Jugador jug;

    public static Jugadores getJugadores(){
        if(jugadores == null){
            jugadores = new Jugadores(2);
        }
        return jugadores;
    }


    private Jugadores(int personas){
        this.personas = personas;
        jugador = new Jugador[personas];
        crearJugadores(personas);
    }

    private void crearJugadores(int personas){
        for(int i=0; i<personas; i++){
            jugador[i] = new Jugador();
            jugador[i].setPesa(jug.demanarPesa());
        }
    }

    public void setJugador(Jugador[] jugador){
        this.jugador = jugador;
    }

    public Jugador[] getJugador(){
        return jugador;
    }

}
