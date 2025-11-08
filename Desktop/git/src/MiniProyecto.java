import java.util.Scanner;
public class MiniProyecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        int sumaNumeros = (num1 + num2 + num3);
        int MediaNumeros = (sumaNumeros / 3);
        System.out.println("La media de los numeros es : " + MediaNumeros);
        scanner.close();
    }
    
}