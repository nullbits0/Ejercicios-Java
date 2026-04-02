import java.util.Scanner;

public class Ejercicio6U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        boolean valido = true;
        int num = 0;
        System.out.println("ingrese un numero del 1 al 12:");
        while (valido) {
            try {
            num = input.nextInt();
            if (num < 1 || num > 12) {
                System.out.println("numero no valido debe de ser del 1 al 12");
            }
            else {
                valido = false;
            }
            } catch (Exception e) {
            System.out.println("error, debe de ingresar un numero");
            input.next();
            }
            
        }
        input.close();
        System.out.println("el mes es " + meses[num - 1] + " y tiene " + numDias[num - 1] + " dias");
    }
}
