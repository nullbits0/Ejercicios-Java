import java.util.Scanner;

public class EjercicioPractica12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numEmpleados = 2;
        int contadorEmpleados = 0;
        int cobranMenos = 0;
        int cobranMas = 0;
        float totalSueldo = 0;

        for (int i = 0; i < numEmpleados; i++) {
            contadorEmpleados ++;
            System.out.println("cuanto cobre el empleado " + contadorEmpleados);
            float sueldo = input.nextFloat();

            if (sueldo >= 100 && sueldo <= 300) {
                cobranMenos ++;
            } else if (sueldo > 300 && sueldo <= 500) {
                cobranMas ++;
            }else {
                System.out.println("invalido");
            }

            totalSueldo += sueldo;
        }
        System.out.println("cobran entre 100 y 300 = " + cobranMenos);
        System.out.println("cobran mas de 300 = " + cobranMas);
        System.out.println("total que gasta la empresa por sueldos = " + totalSueldo);
         input.close();
    }
}
