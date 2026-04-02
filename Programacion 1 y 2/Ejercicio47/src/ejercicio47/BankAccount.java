/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio47;

/*1. Cree una clase BankAccount con los atributos accountNumber y balance. Esta clase incluye métodos para depositar y retirar fondos, y mostrar el saldo actual.
En el método principal, cree una instancia, realice al menos un depósito y un retiro, y muestre el saldo después de cada transacción.
 */
public class BankAccount {
    public long accountNumber;
    public double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void depositarFondos(double fondo){
        balance += fondo;
        System.out.println("nuevo balance " + balance);
    }
    
    public void retirarFondos(double fondo){
        balance -= fondo;
        System.out.println("nuevo balance " + balance);
    }
}
