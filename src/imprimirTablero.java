public class imprimirTablero {
    private Tablero t = Tablero.getTablero(6,7);
    public static final String ANSI_BLUE = "\u001B[34m";



    public void imprimirTablero(){
        for(int i = 0; i<t.getFilas(); i++){
            System.out.println();
            for(int k = 0; k<t.getColumnas(); k++){
                System.out.print(ANSI_BLUE +" [  ]");
            }
        }
    }
}
