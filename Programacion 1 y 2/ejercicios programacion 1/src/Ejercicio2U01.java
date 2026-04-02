import java.util.Scanner;

public class Ejercicio2U01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
        }
        scanner.close();
    }
    
}
