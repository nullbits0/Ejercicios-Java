    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial10;

/*"Simula una retirada de efectivo de un cajero automático. El usuario tiene un saldo inicial (por ejemplo, 1000000). 
Pregúntele cuánto desea retirar. Si el retiro es menor o igual al saldo realice la operacion y muestre el saldo restante. 
De lo contrario, muestre un mensaje de fondos insuficientes."
 */
public class Parcial10 {

    public static void main(String[] args) {
        Retirar retirar1 = new Retirar(850000);
        System.out.println("retirar1 = " + retirar1.retirarSaldo());
        System.out.println("retirar1 = " + retirar1.mostrarInformacion());
    }
    
}
