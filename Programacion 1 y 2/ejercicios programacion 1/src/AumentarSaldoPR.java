class CuentaBancaria{
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
}
public class AumentarSaldoPR {
    public static void main(String[] args) {
    CuentaBancaria cuenta = new CuentaBancaria("Luisa", 1000.0);
    System.out.println("ANTES: " + cuenta.titular + "- " + cuenta.saldo);

    incrementarSaldo(cuenta);

    System.out.println("DESPUÉS: " + cuenta.titular + "- " + cuenta.saldo);
    
}
public static void incrementarSaldo(CuentaBancaria cuenta){
    cuenta.saldo *= 1.10;
}
    
}

