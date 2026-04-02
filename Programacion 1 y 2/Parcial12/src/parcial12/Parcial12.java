/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial12;

/*"Una profesora quiere saber cuántos alumnos asistieron hoy. La profe cuenta con el número total de alumnos matriculados y una lista 
de nombres de estudiantes con su respectiva asistencia,  luego pregunta uno por uno si asistió (true/false). Al final, muestra cuántos 
asistieron y cuántos faltaron."
 */
public class Parcial12 {

    public static void main(String[] args) {
        String[] listaNombres = {"vergonia","juancho camelas","sussie","dolores"};
        Asistencia asistencia1 = new Asistencia(listaNombres);
        asistencia1.tomarAsistencia();
        asistencia1.mostarAsistencia();
                
    }
    
}
