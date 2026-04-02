public class EjercicioPractica5 {
    public static void main(String[] args) {
        int numPrimero = 98;
        int numSegundo = 2;

        if (numPrimero == numSegundo) {
            System.out.println("error, numeros iguales");
        }else{
            if (numPrimero>numSegundo) {
                System.out.println("el primer numero (" + numPrimero + ") es mayor que el segundo numero (" + numSegundo + ")");
            }else{
                System.out.println("el segundo numero (" + numSegundo + ") es mayor que el primer numero (" + numPrimero + ")");
            }
        }
    }
}
