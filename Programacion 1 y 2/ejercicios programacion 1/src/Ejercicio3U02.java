import java.util.Scanner;

public class Ejercicio3U02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            try{
                notas [i] = input.nextDouble();
                if (notas[i]< 0 || notas[i]> 10) {
                    System.out.println("nota no valida, debe estar entre 0 y 10 ");
                    i--;
                }
            }catch (Exception e){
                System.out.println("Error, debe ingresar un número");
                input.next(); // Limpiar el buffer
                i--; // Decrementar i para repetir la iteración
                continue; // Continuar con la siguiente iteración
            }
           
        }
            
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota "+ (i + 1) + ": " + notas[i]);
        }
        media(notas);
        mayor(notas);
        menor(notas);
        input.close();

       
    }
    public static void media (double [] arr){
        double suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        double media = suma/arr.length;
        System.out.println("la nota media es " + media);

    }
    public static void mayor (double [] arr){
        double mayor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> mayor){
                mayor = arr[i];
            }
        }
        System.out.println("la nota mayor es " + mayor);
    }
    public static void menor (double [] arr){
        double menor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }
        System.out.println("la nota menor es " + menor);
    }
}
