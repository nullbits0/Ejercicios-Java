import java.util.Scanner;

public class EjercicioPractica3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero positivo de uno o dos digtos (1..99)");
        int numero = input.nextInt();

        if (numero < 0 || numero > 99) {
            System.out.println("error");
        } else{
            System.out.println("el numero ingresado es:" + numero);

            if (numero >= 1 && numero <= 9) {
                System.out.println("numero tiene un digito");
            }else{
                System.out.println("el numero tiene 2 digitos");
            }

        }
        
        input.close();
    }
}
