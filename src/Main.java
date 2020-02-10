public class Main {
    public static void main(String[] args) {
        Tablero t1 = Tablero.getTablero(6,7);
        imprimirTablero t2 = new imprimirTablero();
        t2.imprimirTablero();

        Jugadores j = Jugadores.getJugadores();
        j.crearJugadores(j.getPersonas());
        System.out.println();
        for(int i=0; i<j.getPersonas(); i++){
            System.out.println(j.getJugador()[i].getPesa());
        }


    }

}
