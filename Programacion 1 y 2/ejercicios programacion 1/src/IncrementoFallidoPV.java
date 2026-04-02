public class IncrementoFallidoPV {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("antes de incremento = " + numero);

        incremento(numero);

        System.out.println("despues del metodo = " + numero);

    }
    public static void incremento(int numero){
        numero = numero + 2;
        System.out.println("dentro del metodo = " + numero);
    }
}
