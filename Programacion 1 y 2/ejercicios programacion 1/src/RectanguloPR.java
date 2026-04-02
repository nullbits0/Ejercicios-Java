class Rectangulo {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }
}
public class RectanguloPR {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 20);
        System.out.println("Antes de modificar:");
        System.out.println("Ancho: " + miRectangulo.ancho);
        System.out.println("Alto: " + miRectangulo.alto);

        modificarRectangulo(miRectangulo);

        System.out.println("Despued de modificar");
        System.out.println("Ancho: " + miRectangulo.ancho);
        System.out.println("Alto: " + miRectangulo.alto);
    }
    public static void modificarRectangulo(Rectangulo r){
        r.ancho = 100;
        r.alto = 50;
    }
}
