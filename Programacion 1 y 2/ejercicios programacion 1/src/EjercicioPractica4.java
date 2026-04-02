import java.util.Scanner;

public class EjercicioPractica4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("ingrese su sueldo");
        float sueldo = input.nextFloat();

        if (sueldo > 3000) {
            System.out.println("usted debe pagar impuestos");
            
        }else{
            System.out.println("usted no debe pagar impuestos");
        }
        input.close();
    }
}
