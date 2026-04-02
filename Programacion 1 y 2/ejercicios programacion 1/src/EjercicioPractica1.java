import java.util.Scanner;

public class EjercicioPractica1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("ingrese el primer numero:");
    int numPrimero = input.nextInt();
    System.out.println("ingrese el segundo numero:");
    int numSegundo = input.nextInt();

    if(numPrimero > numSegundo){
        int suma = numPrimero + numSegundo;
        int diferencia = numPrimero - numSegundo; 

        System.out.println("la suma de los dos numeros es: " + suma + " y la resta de los dos numeros es: " + diferencia);

    }else {
        int producto = numPrimero * numSegundo;
        int division = numPrimero / numSegundo; 

        System.out.println("el producto de los dos numeros es: " + producto + " y la division de los dos numeros es: " + division);
    }

   input.close();
    }
}