public class EjercicioPractica7 {
    public static void main(String[] args) {
        int numEntero = 6646;

        if (numEntero >= 1 && numEntero <= 9) {
            System.out.println("tiene una cifra");
        }else if (numEntero >= 10 && numEntero <= 99 ) {
            System.out.println("tinen dos cifras");
        }else if (numEntero >= 100 && numEntero <= 999) {
            System.out.println("tiene tres cifras");
        }else {
            System.out.println("error, tiene mas de tres cifras");
        }
    }
}
