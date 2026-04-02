import java.util.Scanner;

public class Ejercicio7U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tamaño = 5;
        int[] vector1 = new int [tamaño];
        int[] vector2 = new int [tamaño];
        int[] vector3 = new int [tamaño];

        System.out.println("ingrese un numero para el vector 1:");
        for (int i = 0; i < tamaño; i++) {
            vector1[i] = input.nextInt();
        }
        System.out.println("ingrese un numero para el vector 2:");
        for (int i = 0; i < tamaño; i++) {
            vector2[i] = input.nextInt();
        }
        for (int i = 0; i < tamaño; i++) {
            vector3[i] = vector2[i] + vector1[i];
        }
        System.out.println("el valor del vector 3 es:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println(vector1[i] + " + "+ vector2[i] + " = " + vector3[i]);
        }
        input.close();
    }
}
