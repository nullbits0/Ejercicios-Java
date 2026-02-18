/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/*3. Si una persona ganó la lotería, debe pagar impuestos según el monto ganado. 
Si supera los 100 salarios mínimos, debe pagar el 40%; de lo contrario, el 20%. Muestre el total pagado en la terminal.
 */
public class Loteria {
    public double montoGanado;
    public static double cienSalariosMinimos = 1400000 * 100;

    public Loteria(double montoGanado) {
        this.montoGanado = montoGanado;
    }
    
    public double calcularImpuestos(){
        if (montoGanado > Loteria.cienSalariosMinimos) {
            return montoGanado * 0.4;
        }
        return montoGanado * 0.2;
    }
}
