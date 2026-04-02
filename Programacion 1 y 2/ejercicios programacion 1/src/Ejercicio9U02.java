import java.util.Scanner;

public class Ejercicio9U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamaño = 2;
        double[] temperaturas = new double[tamaño];
        int contador = 0;

        media(temperaturas, input);
        menorTemperatura(temperaturas);

        System.out.println("ingrese una temperatura para comprobar si coincide con una de las temperaturas almacenadas");
        double newTemp = input.nextDouble();
        for (int i = 0; i < tamaño; i++) {
            if (temperaturas[i] == newTemp) {
                System.out.println("la temperatura ingresa coincide con la temperatura del dia: " + (i + 1));
                contador++;
            }else{
                continue;
            }
        }
        if (contador == 0) {
            System.out.println("La temperatura ingresada no coincide con ninguna de las temperaturas almacenadas");
        }
        input.close();

    }
    public static void media(double[] temperaturas, Scanner input) {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("ingrese 3 temparaturas del dia: " + (i + 1));
            double temp1 = input.nextDouble();
            double temp2 = input.nextDouble();
            double temp3 = input.nextDouble();
            temperaturas[i] = (temp1 + temp2 + temp3) / 3;
        }
    }
    public static void menorTemperatura(double[] temperaturas){
        double menor = temperaturas[0];
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }
        System.out.println("el dia con menor temoeratura es: " + menor);
    }
}
