/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1;

/*"Cree una clase llamada CuentaBancaria con los atributos nombreCliente, documentoCliente y saldo, todos los clientes 
tienen un saldo base de 100000 pesos que debe enseñar al sistema. Esta clase incluye métodos para depositar y 
retirar fondos, y mostrar el saldo actual.
En el método principal, cree una instancia, realice al menos un depósito y un retiro, y muestre el saldo después de cada transacción."
 */
public class Parcial1 {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("vergonia", "192478");
        CuentaBancaria cuenta2 = new CuentaBancaria("dolores", "192025");
        
        System.out.println("cuenta1 = " + cuenta1.mostrarSaldo());
        System.out.println("cuenta1 = " + cuenta1.depositarSaldo(85000));
        System.out.println("cuenta1 = " + cuenta1.retirarSaldo(50000));
        
        System.out.println("cuenta2 = " + cuenta2.mostrarSaldo());
        System.out.println("cuenta2 = " + cuenta2.depositarSaldo(100000));
        System.out.println("cuenta2 = " + cuenta2.retirarSaldo(10000));
    }
}
