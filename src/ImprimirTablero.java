public class ImprimirTablero {
    private Tablero t = Tablero.getTablero(6,7);
    public static final String ANSI_BLUE = "\u001B[34m";


    public void imprTab(){
        System.out.println();
        for(int p=0; p<t.getColumnas(); p++){
            System.out.print(ANSI_BLUE+"   "+(p+1) +" ");
        }
        for(int i = 0; i<t.getFilas(); i++){
            System.out.println();
            for(int k = 0; k<t.getColumnas(); k++){
                System.out.print(ANSI_BLUE +" [  ]");
            }
        }
    }
}
