public class CrearTablero {
    Tablero t = Tablero.getTablero(6,7);
    Casilla[][] casillas = new Casilla[t.getFilas()][t.getColumnas()];
    public static final String ANSI_BLUE = "\u001B[34m";

    private Casilla[][] crearTablero(){
        for(int i=0; i<t.getFilas(); i++){
            for(int k=0; k<t.getColumnas(); k++){
                casillas[i][k] = new Casilla();
            }
        }
        return casillas;
    }

    public void imprimirTablero(){
        crearTablero();
        for(int i = 0; i<t.getFilas(); i++){
            System.out.println();
            for(int k = 0; k<t.getColumnas(); k++){
                System.out.print(ANSI_BLUE +" [  ]");
            }
        }
    }
}
