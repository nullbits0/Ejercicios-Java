import java.util.Scanner;

public class EjercicioPractica11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numEstudiante = 0;
        int notasMayores = 0;
        int notasInferiores = 0;

        for (int i = 0; i < 10; i++) {
            numEstudiante ++;
            
            System.out.println("ingrese la nota del estudiante " + numEstudiante);
            float nota = input.nextFloat();

            if (nota >= 7) {
                notasMayores ++;
            }else{
                notasInferiores ++;
            }
        }
        System.out.println("notas iguales o superiores a 7: " + notasMayores);
        System.out.println("notas inferiores a 7: " + notasInferiores);
        input.close();
    }
}
