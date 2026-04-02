import java.util.Scanner;

public class Ejercicio13U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nombres = new String[3];
        double [][] kmSemana = new double[3][7];
        double [] totalKms = new double[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ingrese el nombre del conductor " + (i + 1));
            nombres[i] = input.nextLine();
            double suma = 0;
            System.out.println("ingrese los km recorridos por el corredor " + nombres[i] + " en los 7 dias de la semana:");
                for (int k = 0; k < 7; k++) {
                    System.out.println("dia " + (k + 1) + ":");
                    kmSemana[i][k] = input.nextDouble();
                    suma += kmSemana[i][k];
                }
                totalKms[i] = suma;
                input.nextLine();
        }
        
        input.close();
        for (int i = 0; i < totalKms.length; i++) {
            System.out.println(nombres[i] + " - recorrido total de la semana: " + totalKms[i]);
        }
    }
}
