import java.util.Scanner;

public class Demanar {
    private int colocar;
    public static final String ANSI_RED = "\u001B[31m";

    Scanner sc = new Scanner(System.in);
    public void demanarColumnes(){
        System.out.println();
        System.out.println();
        System.out.println(ANSI_RED +"A quina columna vols colocar la fitxa??");
        colocar = sc.nextInt();
    }
}
