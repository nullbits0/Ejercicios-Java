import java.util.Scanner;
public class leerEntero {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un numero entero: ");
    int numEntero = scanner.nextInt();
    System.out.println("el numero entero que ingresaste es: " + numEntero);
    scanner.close();

    }

}