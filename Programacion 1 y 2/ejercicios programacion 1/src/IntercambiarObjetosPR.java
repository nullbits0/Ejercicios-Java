class Punto{
    int x;
    int y;

    Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class IntercambiarObjetosPR {
    public static void main(String[] args) {
        Punto P1 = new Punto(1, 2);
        Punto P2 = new Punto(3, 4);

        System.out.println("antes: p1=(" + P1.x + "," + P1.y + ") y p2= (" + P2.x + "," + P2.y + ")");

        IntercambioPuntos(P1, P2);

         System.out.println("despues: p1=(" + P1.x + "," + P1.y + ") y p2= (" + P2.x + "," + P2.y + ")");

    }
    public static void IntercambioPuntos(Punto a, Punto b){
        Punto temp = a;
        a = b;
        b = temp;
    }
    
}
