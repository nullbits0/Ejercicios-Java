import java.util.Scanner;

public class leerPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese una palabra: ");
        String Palabra = scanner.next();

        System.out.print("la palabra que usted ingreso es: (" + Palabra + ")");

        scanner.close();
    }
}
