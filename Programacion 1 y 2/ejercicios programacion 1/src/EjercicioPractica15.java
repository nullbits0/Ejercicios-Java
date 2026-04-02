import java.util.Scanner;

public class EjercicioPractica15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = input.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = input.nextLine();

        int comparacion = nombre1 .compareToIgnoreCase(nombre2);

        if (comparacion < 0) {
            System.out.println("nombres ordenados alfabeticamente: ");
            System.out.println(nombre1);
            System.out.println(nombre2);
        }else if (comparacion > 0) {
            System.out.println("nombres ordenados alfabeticamente: ");
            System.out.println(nombre2);
            System.out.println(nombre1);
        }else{ 
            System.out.println("los nombres son iguales");
        }
        input.close();
    }
}
