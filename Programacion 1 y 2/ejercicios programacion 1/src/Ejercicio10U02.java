public class Ejercicio10U02 {
    public static void main(String[] args) {
        int [][] matriz = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("la suma de cada fila y de cada coluna es de: " + suma);
    }
}
