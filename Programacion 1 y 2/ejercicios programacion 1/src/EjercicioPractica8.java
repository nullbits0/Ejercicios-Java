import java.util.Scanner;

public class EjercicioPractica8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de preguntas ");
        int cantidadPreguntas = input.nextInt();
        System.out.println("ingrese la cantidad de preguntas correctas");
        int preguntasCorrectas = input.nextInt();

        float porcentaje = ((float)preguntasCorrectas/cantidadPreguntas) * 100;
         
        if (porcentaje >= 90) {
            System.out.println("nivel superior");
        } else if (porcentaje >= 75) {
            System.out.println("nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("nivel regular");
        }else {
            System.out.println("fuera de nivel");
        }
        input.close();
    }
}
