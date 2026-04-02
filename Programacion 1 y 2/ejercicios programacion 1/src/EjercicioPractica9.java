import java.util.Scanner;

public class EjercicioPractica9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese la primera nota");
        float primeraNota = input.nextFloat();
        System.out.println("ingrese la segunda nota");
        float segundaNota = input.nextFloat();
        System.out.println("ingrese la tercera nota");
        float terceraNota = input.nextFloat();

        float promedio = (primeraNota + segundaNota + terceraNota) / 3;

        if (promedio >= 7) {
            System.out.println("promocionado");
        } else if (promedio >= 4) {
            System.out.println("regular");
        } else {
            System.out.println("reprobado");
        }
        input.close();
    }
}
