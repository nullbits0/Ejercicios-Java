/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/*4. Un profesor quiere saber la edad promedio de las mujeres de su clase y verificar si son menores de 18 años.
De los 20 estudiantes, 15 son hombres.
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(20, 15);
        
        estudiante1.rellenarEdadesMujeres();
        
        System.out.println("estudiante1  = " + estudiante1.calcularPromedioMujeres());
        System.out.println("estudiante1 = " + estudiante1.verificarMayoriaEdad());
    }
    
}
