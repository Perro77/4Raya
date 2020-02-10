public class Partida {
    private Tablero t1 = Tablero.getTablero(6,7);
    private ImprimirTablero t2 = new ImprimirTablero();
    Jugadores j = Jugadores.getJugadores();
    Demanar d1 = new Demanar();

    public void imprimirPartida(){
        j.crearJugadores(j.getPersonas());
        while(true){
            t2.imprTab();
            d1.demanarColumnes();
        }
    }



}
