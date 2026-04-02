import java.util.Scanner;

public class Ejercicio15U02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Tabla de equipos (15 partidos x 2 equipos)
        String[][] equipos = new String[15][2];
        // Tabla de resultados (15 partidos x 2 goles)
        int[][] resultados = new int[15][2];
        
        // Leer los nombres de los equipos
        System.out.println("Introduce los equipos de cada partido:");
        for (int partido = 0; partido < 15; partido++) {
            System.out.println("\nPartido " + (partido + 1) + ":");
            System.out.print("Equipo local: ");
            equipos[partido][0] = input.nextLine();
            System.out.print("Equipo visitante: ");
            equipos[partido][1] = input.nextLine();
        }
        
        // Leer los resultados de los partidos
        System.out.println("\nIntroduce los resultados de cada partido:");
        for (int partido = 0; partido < 15; partido++) {
            System.out.println("\nPartido " + (partido + 1) + ": " + 
                             equipos[partido][0] + " vs " + equipos[partido][1]);
            System.out.print("Goles de " + equipos[partido][0] + ": ");
            resultados[partido][0] = input.nextInt();
            System.out.print("Goles de " + equipos[partido][1] + ": ");
            resultados[partido][1] = input.nextInt();
            input.nextLine(); // Limpiar el buffer
        }
        
        // Mostrar todos los partidos con sus resultados
        System.out.println("\nResultados de la quiniela:");
        System.out.println("-------------------------------------------");
        for (int partido = 0; partido < 15; partido++) {
            System.out.printf("%2d. %-20s %d - %d %s%n",
                             (partido + 1),
                             equipos[partido][0],
                             resultados[partido][0],
                             resultados[partido][1],
                             equipos[partido][1]);
        }
        
        // Calcular y mostrar las quinielas (1, X, 2)
        System.out.println("\nQuinielas:");
        System.out.println("-------------------------------------------");
        for (int partido = 0; partido < 15; partido++) {
            char resultado;
            if (resultados[partido][0] > resultados[partido][1]) {
                resultado = '1'; // Victoria local
            } else if (resultados[partido][0] < resultados[partido][1]) {
                resultado = '2'; // Victoria visitante
            } else {
                resultado = 'X'; // Empate
            }
            
            System.out.printf("%2d. %-20s vs %-20s: %c%n",
                             (partido + 1),
                             equipos[partido][0],
                             equipos[partido][1],
                             resultado);
        }
        
        input.close();
    }
}
