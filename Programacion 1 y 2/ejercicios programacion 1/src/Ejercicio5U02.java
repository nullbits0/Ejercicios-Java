import java.util.Arrays;

public class Ejercicio5U02 {
    public static void main(String[] args) {
        int[] numAleatorios = new int[5];

        for (int i = 0; i < numAleatorios.length; i++) {
            numAleatorios[i] = (int) (Math.random() *100);
        }
        Arrays.sort(numAleatorios);
        System.out.println("los numeros aleatorios son: ");
        for (int i = 0; i < numAleatorios.length; i++) {
            
            System.out.println(numAleatorios[i]);

        }
    }
}
