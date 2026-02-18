/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoparcial;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class SegundoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado>empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("vergonia","192478",4000000.00));
        for(Empleado empleado : empleados) {
            empleado.calcularTotalPagar();
        }
    }
    
}
