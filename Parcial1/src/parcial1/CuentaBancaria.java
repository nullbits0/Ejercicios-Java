/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/*"Cree una clase llamada CuentaBancaria con los atributos nombreCliente, documentoCliente y saldo, todos los clientes 
tienen un saldo base de 100000 pesos que debe enseñar al sistema. Esta clase incluye métodos para depositar y 
retirar fondos, y mostrar el saldo actual.
En el método principal, cree una instancia, realice al menos un depósito y un retiro, y muestre el saldo después de cada transacción."
 */
public class CuentaBancaria {
    public String nombreCliente;
    public String documentoCliente;
    public double saldo;

    public CuentaBancaria(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public CuentaBancaria(String nombreCliente, String documentoCliente, double saldo) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.saldo = saldo;
    }

    public CuentaBancaria(String nombreCliente, String documentoCliente) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.saldo = 100000;
    }
    
    public String mostrarSaldo(){
        return "hola, " + this.nombreCliente + "; con el documento "+ this.documentoCliente + "; te informo que tu sueldo actual es de " + this.saldo;
    }
    
    public String depositarSaldo(double depositado){
        saldo += depositado;
        return mostrarSaldo();
    }
    
    public String retirarSaldo(double retirado){
        if (this.saldo >= retirado) {
            saldo -= retirado;
        }else{
            saldo *= retirado;
        }
        
        return mostrarSaldo();
    }
}
