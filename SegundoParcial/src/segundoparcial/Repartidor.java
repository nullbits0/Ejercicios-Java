/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcial;

/**
 *
 * @author juane
 */
public class Repartidor extends Empleado{
    
    public Repartidor(String nombres, String documento, double sueldoBasico) {
        super(nombres, documento, sueldoBasico);
    }

    public Repartidor(String nombres, String documento, double sueldoBasico, boolean esCasado) {
        super(nombres, documento, sueldoBasico, esCasado);
    }
    
}
