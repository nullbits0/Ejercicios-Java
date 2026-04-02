class Punto {
    int x;
    int y;
    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class IntercambioValoresPR {
    public static void main(String[] args) {
        Punto puntoA = new Punto(3 , 5);
        Punto puntoB = new Punto(10, 2);
        System.out.println("ANTES: A(" + puntoA.x + ", " + puntoA.y + ") B(" + puntoB.x + ", " + puntoB.y + ")");
    
        intercambiarPuntos(puntoA, puntoB);

        System.out.println("DESPUES: A(" + puntoA.x + ", " + puntoA.y + ") B(" + puntoB.x + ", " + puntoB.y + ")");
    }
    public static void intercambiarPuntos(Punto a, Punto b){
        int tempX = a.x;
        int tempY = a.y;
        a.x = b.x;
        a.y = b.y;
        b.x = tempX;
        b.y = tempY;
    }  
}