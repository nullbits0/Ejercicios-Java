public class Ejercicio11U02 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int[][] diagonal = new int [filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                }else{
                    diagonal[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
