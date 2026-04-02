public class ValorModificadoPV {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Antes de modificar: " + x);

        incrementar(x);
        System.out.println("Después de modificar: " + x);
    }
    public static void incrementar(int x){
        x++;
        System.out.println("Dentro de la función incrementar: " + x);
    }
}
