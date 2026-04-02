public class Ejercicio12U01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int count100a300 = 0;
        int countMas300 = 0;
        int totalSueldos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            int sueldo = scanner.nextInt();

            if (sueldo >= 100 && sueldo <= 300) {
                count100a300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                countMas300++;
            }
            totalSueldos += sueldo;
        }

        System.out.println("Empleados que cobran entre $100 y $300: " + count100a300);
        System.out.println("Empleados que cobran más de $300: " + countMas300);
        System.out.println("Total que gasta la empresa en sueldos: $" + totalSueldos);

        scanner.close();
    }
}
