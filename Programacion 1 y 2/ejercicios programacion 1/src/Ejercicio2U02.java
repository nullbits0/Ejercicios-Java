import java.util.Scanner;

public class Ejercicio2U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] nombres = new String[5];
        String [] inverso = new String[5];

        System.out.println("Ingrese 5 nombres: ");
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = input.nextLine();
        }
        for (int i = 0; i < nombres.length; i++) {
            inverso[i] = nombres[nombres.length - 1 - i];
        }
        System.out.println("los nombres en orden son: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("los nombres en orden inverso son:");
        for (int i = 0; i < inverso.length; i++) {
            System.out.println(inverso[i]);
        }
        input.close();
    }
}
