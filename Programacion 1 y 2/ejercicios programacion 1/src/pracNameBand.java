import java.util.Scanner;

public class pracNameBand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese algo que te emocione en una palabra: ");
        String palabraEmocionante = scanner.nextLine();
        System.out.print("Ingrese una palabra aleatoria: ");
        String palabraAleatoria = scanner.nextLine();

        String nombreBanda =  palabraAleatoria + " " + palabraEmocionante;

        System.out.println("el nombre para una banda podira ser: " + nombreBanda);
        scanner.close();

    }
}
