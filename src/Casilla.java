public class Casilla {
    Tablero t = Tablero.getTablero(6,7);
    Casilla[][] casillas = new Casilla[t.getFilas()][t.getColumnas()];

    private Casilla[][] crearTablero(){
        for(int i=0; i<casillas.length; i++){
            for(int k=0; k<casillas[i].length; k++){
                casillas[i][k] = new Casilla();
            }
        }
        return casillas;
    }

    public void imprimirTablero(){
        crearTablero();
        for(int i=0; i<=casillas.length; i++){
            System.out.print("");
            for(int k=0; i<=casillas[i].length; k++){
                System.out.println(casillas[i][k]);
            }
        }
    }

}
