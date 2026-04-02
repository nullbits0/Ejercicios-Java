public class Ejercicio11U01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int countMayores = 0;
        int countMenores = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            int nota = scanner.nextInt();
            if (nota >= 7) {
                countMayores++;
            } else {
                countMenores++;
            }
        }

        System.out.println("Cantidad de alumnos con nota mayor o igual a 7: " + countMayores);
        System.out.println("Cantidad de alumnos con nota menor a 7: " + countMenores);
        scanner.close();
    }
}
