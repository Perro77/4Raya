
public class Jugadores {

    private static Jugadores jugadores;
    private int personas;
    private Jugador[] jugador;

    public static Jugadores getJugadores(){
        if(jugadores == null){
            jugadores = new Jugadores(2);
        }
        return jugadores;
    }


    private Jugadores(int personas){
        this.personas = personas;
        jugador = new Jugador[personas];
    }

    public void crearJugadores(int personas){
        for(int i=0; i<personas; i++){
            jugador[i] = new Jugador();
            //jugador[i].seleccionarPesa();
        }
    }

    public void setJugador(Jugador[] jugador){
        this.jugador = jugador;
    }

    public Jugador[] getJugador(){
        return jugador;
    }

    public void setPersonaa(int personas){
        this.personas = personas;
    }

    public int getPersonas(){
        return personas;
    }

}
