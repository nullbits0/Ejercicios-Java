import java.util.Scanner;

public class mayorMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero: ");
        byte primerNumero = scanner.nextByte();
        System.out.println("ingrese el segundo numero: ");
        byte segundoNumero = scanner.nextByte();
        System.out.println("ingrese el tercer numero: ");
        byte tercerNumero = scanner.nextByte();

        if (primerNumero > segundoNumero && primerNumero > tercerNumero) {

            System.out.println("el primer numero es mayor que el segundo y tercero" );
        }

        if (primerNumero < segundoNumero && primerNumero > tercerNumero) {

            System.out.println("el numero es menor que el segundo numero y mayor que el tercero" );
        }
        
        // este es el que pide el ejercicio
        if (primerNumero > segundoNumero && primerNumero < tercerNumero) {

            System.out.println("el numero es mayor que el segundo numero y menor que el tercero" );
        }

        if (primerNumero < segundoNumero && primerNumero < tercerNumero) {

            System.out.println("el numero es menor que el segundo numero y menor que el tercero" );
        }

        scanner.close();
        
    }
}
