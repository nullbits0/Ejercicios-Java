public class Ejercicio5U01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (distinto al primero): ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
        } else if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }

        scanner.close();
    }
}
