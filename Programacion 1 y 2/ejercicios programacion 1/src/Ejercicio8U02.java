import java.util.Scanner;

public class Ejercicio8U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamaño = 5;
        String[] nombres = new String[tamaño];
        int[] edades = new int[tamaño];
        int contador = 0;

        System.out.println("ingrese un nombre y  edad:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("ingrese un nombre:");
            nombres[i] = input.nextLine();
                if (nombres[i].equals("*")) {
                    break;
                }
            System.out.println("ingrese la edad:");    
            edades[i] = input.nextInt();
            input.nextLine();    
            if (edades[i] >= 18) {
                    contador++;
                }
        }
        input.close();
        System.out.println("la cantidad de persoas mayores de edad son: " + contador);
        System.out.println("los nombres son: ");
        for (int i = 0; i < tamaño; i++) {
            if (edades[i] < 18) {
                continue;
            }
            System.out.println(nombres[i] + " y su edad es: " + edades[i]);
        }

    }
}
