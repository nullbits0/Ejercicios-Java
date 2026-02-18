/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio47;

/*1. Cree una clase BankAccount con los atributos accountNumber y balance. Esta clase incluye métodos para depositar y retirar fondos, y mostrar el saldo actual.
En el método principal, cree una instancia, realice al menos un depósito y un retiro, y muestre el saldo después de cada transacción.
 */
public class Ejercicio47 {

    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount(192478, 25000);
        cuenta1.depositarFondos(20000);
        cuenta1.retirarFondos(10000);
    }
    
}
