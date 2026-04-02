public class CadenaPV {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.println("ANTES DE MODIFICAR: " + texto);
        modificarCadena(texto);
        System.out.println("DESPUES DE MODIFICAR: " + texto);
    }
    public static void modificarCadena(String texto){
        texto = "choripapa con pepsi";
        System.out.println("DENTRO DEL METODO: "+ texto);
    }
}
