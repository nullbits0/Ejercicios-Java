public class Ejercicio10U01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();

        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = scanner.nextInt();

        double sueldoFinal = sueldo;

        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldoFinal = sueldo * 1.20;
                System.out.println("Sueldo con aumento del 20%: " + sueldoFinal);
            } else {
                sueldoFinal = sueldo * 1.05;
                System.out.println("Sueldo con aumento del 5%: " + sueldoFinal);
            }
        } else {
            System.out.println("Sueldo sin cambios: " + sueldoFinal);
        }

        scanner.close();
    }
}
