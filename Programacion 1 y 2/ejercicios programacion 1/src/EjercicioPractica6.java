import java.util.Scanner;

public class EjercicioPractica6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int valorEntero = input.nextInt();

        if (valorEntero < 0) {
            System.out.println("el numero es negativo");
        }else if (valorEntero > 0) {
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es nulo");
        }
        input.close();
    }
}