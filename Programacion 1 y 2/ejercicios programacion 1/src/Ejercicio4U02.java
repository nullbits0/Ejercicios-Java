import java.util.Scanner;

public class Ejercicio4U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[10];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero entero positivo y diferente a 0:");
            int num = input.nextInt();
            if (num < 0) {
                break;
            }
            numeros[i] = num;
            contador++;
        }
        input.close();
        System.out.println("los numeros ingresados son:");
        for (int i = 0; i < contador; i++) {
            System.out.println(numeros[i]);
        }
    }
}
