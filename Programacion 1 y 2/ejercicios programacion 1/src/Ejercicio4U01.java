public class Ejercicio4U01 {
public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Ingrese el sueldo: ");
    double sueldo = scanner.nextDouble();
    if (sueldo > 3000) {
        System.out.println("Debe abonar impuestos.");
    }
    scanner.close();
}
}