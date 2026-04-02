public class ModificacionArrays {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};
        System.out.print("ANTES DE MODIFICAR: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        modificarArray(numeros);
        System.out.print("DESPUES DE MODIFICAR: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
    public static void modificarArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
