import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);
    private Character pesa;
    Jugadores jug = Jugadores.getJugadores();

    public char demanarPesa(){
        System.out.println("Quina es sa teva pesa? ");
        pesa = sc.next().charAt(0);
        return pesa;
    }

    public void setPesa(char pesa){
        if(getPesa().equals(Jugadores.getJugadores())){
            System.out.println("No pot ser aquest caracter");
        }else{
            this.pesa = pesa;
            System.out.println("Ha anat be vadeu");
        }
    }

    public Character getPesa(){
        return pesa;
    }
}
