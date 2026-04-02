class Contador {
    int valor;

    public Contador(int valor) {
        this.valor = valor;
    }
    
}
public class ResetearContadorPR {
    public static void main(String[] args) {
        Contador contador = new Contador(42);

        System.out.println("ANTES: " + contador.valor);

        resetear(contador);

        System.out.println("DESPUES: " + contador.valor);
    }
    public static void resetear(Contador c){
        c.valor = 0;
    }
}
