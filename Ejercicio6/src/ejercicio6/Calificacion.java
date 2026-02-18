/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/*6. Desarrollar un sistema que reciba la calificación de un estudiante y verifique si ganó o perdió la prueba.
 */
public class Calificacion {
    public double calificacion;

    public Calificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public boolean verificarAprobacion(){
        if (calificacion >= 3.0) {
            return true;
        }
        return false;
    }
}
