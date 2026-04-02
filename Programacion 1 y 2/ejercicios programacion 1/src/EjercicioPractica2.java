import java.util.Scanner;

public class EjercicioPractica2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese la primera nota: ");
        float primeraNota = input.nextFloat();
        System.out.println("ingrese la segunda nota: ");
        float segundaNota = input.nextFloat();
        System.out.println("ingrese la tercera nota nota: ");
        float terceraNota = input.nextFloat();

        float promedio = ((primeraNota + segundaNota + terceraNota) / 3);

        if (promedio >= 7.0) {
            System.out.println("promocionado (" + promedio + ")");
        } else{
            System.out.println("recorcholis");
        }

        input.close();
    }
}