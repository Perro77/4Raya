public class Guanyador {
    Tablero t1 = Tablero.getTablero(6,7);
    Jugadores j1 = Jugadores.getJugadores();

    public Guanyador(){
        comprovarGuanyador();
    }

   private void comprovarGuanyador(){
     for(int i=0; i<t1.getCasillas().length; i++){
         for(int k=i; k<t1.getCasillas()[i].length; k++){
             if(t1.getCasillas()[i][k].getOcupada()){
                 System.out.println("Es guanyador es el jugador: " +  j1.getJugador()[i].getPesa());

             }
         }
     }
   }

}
