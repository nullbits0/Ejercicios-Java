import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int divisionPromedio = 5;
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero:");
            numeros[i] = input.nextInt();
            suma += numeros[i];
        }

        int promedio = suma / divisionPromedio;

        System.out.println("promedio de los numeros ingresados es: " + promedio);

        input.close();
    }
}
