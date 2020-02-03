public class Main {
    public static void main(String[] args) {
        //Tablero t1 = Tablero.getTablero(6,7);
        //imprimirTablero t2 = new imprimirTablero();
        //t2.imprimirTablero();

        Jugadores j = Jugadores.getJugadores();

        Jugador j1 = new Jugador();

        j1.setPesa(j1.demanarPesa());
    }


}
