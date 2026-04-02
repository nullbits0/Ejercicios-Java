import java.util.Scanner;

public class leerLinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese una linea de texto: ");
        String lineaTexto = scanner.nextLine();

        System.out.println("la linea de texto que usted ingreso es: (" + lineaTexto + ")");

        scanner.close();

    }
}
