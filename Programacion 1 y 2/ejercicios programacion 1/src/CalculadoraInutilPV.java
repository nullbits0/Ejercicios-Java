public class CalculadoraInutilPV {
    public static void main(String[] args) {
        int numPrimero = 2;
        int numSegundo = 5;

        System.out.println("operaciones original: " + numPrimero + " y " + numSegundo);

        elevadoAlCuadrado(numPrimero, numSegundo);

        System.out.println("cambiaron los valores despues del metodo? " + numPrimero + " y " + numSegundo);


    }
    public static void elevadoAlCuadrado(int prim, int seg){
        prim = prim * prim;
        seg = seg * seg;
        System.out.println("operacion DENTRO del metodo: " + prim + " y " + seg);
    }
}
