import java.util.Scanner;

public class Ejercicio15U01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = input.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = input.nextLine();

        System.out.println("Nombres ordenados alfabéticamente:");
        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else {
            System.out.println(nombre2);
            System.out.println(nombre1);
        }

        input.close();
    }
}