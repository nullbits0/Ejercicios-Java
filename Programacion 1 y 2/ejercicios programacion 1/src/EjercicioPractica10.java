import java.util.Scanner;

public class EjercicioPractica10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingrese su sueldo");
        float sueldo = input.nextFloat();
        System.out.println("ingrese los años de antiguedad");
        int añosAntiguedad = input.nextInt();

        if (sueldo < 500 && añosAntiguedad >= 10) {
            double aumento = sueldo * 0.20;
            sueldo += aumento;
            System.out.println("se aplico el 20% y el sueldo a pagar es de: " + sueldo);
        
        }else if (sueldo < 500 && añosAntiguedad < 10) {
            double aumento = sueldo * 0.05;
            sueldo += aumento;
            System.out.println("se aplico el 5% y el sueldo a pagar es de: " + sueldo);   
        
        }else if (sueldo >= 500) {
            System.out.println("no se aplico ningun aumento y el sueldo es: " + sueldo);
        }
        input.close();
    }
}
