import java.util.Scanner;

public class mediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        byte primerNumero = scanner.nextByte();
        System.out.println("ingrese el segundo numero: ");
        byte segundoNumero = scanner.nextByte();
        System.out.println("ingrese el tercer numero: ");
        byte tercerNumero = scanner.nextByte();

        int Suma = (primerNumero + segundoNumero + tercerNumero);
        int Total = (Suma / 3);

        System.out.println("la media de los tres numeros ingresados es de: " + Total);

        scanner.close();
    }
}
