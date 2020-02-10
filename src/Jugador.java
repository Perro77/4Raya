import java.util.Scanner;

public class Jugador {
    private char pesa;
    Jugadores j1 = Jugadores.getJugadores();



    public Jugador(){
        decidirPesa();
        this.pesa = pesa;
    }

    private char decidirPesa(){
        for(int i=0; i< j1.getPersonas(); i++){
            if(j1.getJugador()[i] == j1.getJugador()[0]){
                pesa = 'X';
            }else{
                pesa = 'O';
            }
        }
        return pesa;
    }

    private void setPesa(char pesa){
        this.pesa = pesa;
    }

    public char getPesa(){
        return pesa;
    }
}
