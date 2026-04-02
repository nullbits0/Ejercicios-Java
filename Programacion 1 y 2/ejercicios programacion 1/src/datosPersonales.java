import java.util.Scanner;

public class datosPersonales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String Nombre = scanner.next();
        System.out.println("ingrese su edad: ");
        byte Edad = scanner.nextByte();
        System.out.println("ingrese su altura: ");
        float Altura = scanner.nextFloat();

        System.out.println("tus datos personales son: " + "nombre: " + Nombre + " tu edad es: " + Edad + " y tu altura es: " + Altura);

        scanner.close();

    }
}
