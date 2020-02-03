public class Tablero{

    private int filas;
    private int columnas;
    private static Tablero tablero;


    public static Tablero getTablero(int filas, int columnas){
        if(tablero == null){
            tablero = new Tablero(filas, columnas);
        }
        return tablero;

    }

    private Tablero(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        crearTablero();
    }

    private Casilla[][] crearTablero(){
        Casilla[][] casillas = new Casilla[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int k=0; k<columnas; k++){
                casillas[i][k] = new Casilla();
            }
        }
        return casillas;
    }


    public int getFilas(){
        return filas;
    }

    public void setFilas(int filas){
        this.filas = filas;
    }

    public int getColumnas(){
        return columnas;
    }

    public void setColumnas(int columnas){
        this.columnas = columnas;
    }


}