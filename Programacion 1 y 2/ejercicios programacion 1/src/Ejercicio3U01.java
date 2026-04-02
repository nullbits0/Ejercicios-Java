import java.util.Scanner;

public class Ejercicio3U01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo de uno o dos dígitos (1..99): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El número tiene un dígito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene dos dígitos.");
        } else {
            System.out.println("El número ingresado no es válido.");
        }
        scanner.close();
    }
}
