public class Jugadores {

    private static Jugadores jugadores;
    private int personas;
    private Jugador[] jugador = new Jugador[personas];

    public static Jugadores getJugadores(){
        if(jugadores == null){
            jugadores = new Jugadores(2);
        }
        return jugadores;
    }


    private Jugadores(int personas){
        this.personas = personas;
        crearJugadores(personas);
    }

    private void crearJugadores(int personas){
        for(int i=0; i<jugador.length; i++){
            jugador[i] = new Jugador();
        }
    }

    public void setJugador(Jugador[] jugador){
        this.jugador = jugador;
    }

    public Jugador[] getJugador(){
        return jugador;
    }

}
