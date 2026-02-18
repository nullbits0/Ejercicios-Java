/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/*3. Si una persona ganó la lotería, debe pagar impuestos según el monto ganado. 
Si supera los 100 salarios mínimos, debe pagar el 40%; de lo contrario, el 20%. Muestre el total pagado en la terminal.
 */
public class Ejercicio11 {

    public static void main(String[] args) {
       Loteria loteria1 = new Loteria(500000000);
        System.out.println("loteria1 = " + loteria1.calcularImpuestos());
    }
    
}
