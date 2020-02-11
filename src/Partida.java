public class Partida {
    private ImprimirTablero t2 = new ImprimirTablero();
    private Jugadores j = Jugadores.getJugadores();
    private Demanar d1 = new Demanar();

    public void imprimirPartida(){
        j.crearJugadores(j.getPersonas());
        while(true){
            t2.imprTab();
            d1.demanarColumnes();
        }
    }
}
