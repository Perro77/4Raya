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