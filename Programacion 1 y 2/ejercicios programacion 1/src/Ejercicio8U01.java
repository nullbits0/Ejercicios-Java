import java.util.Scanner;

public class Ejercicio8U01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int correctas = scanner.nextInt();

        if (totalPreguntas <= 0) {
            System.out.println("La cantidad total de preguntas debe ser mayor que cero.");
        }

        double porcentaje = (correctas * 100.0) / totalPreguntas;

        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }
        scanner.close();
    }
}
