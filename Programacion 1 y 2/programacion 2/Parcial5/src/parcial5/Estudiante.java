/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial5;

/*"Cree una clase Estudiante con los atributos nombre, asignatura y calificación final. Incluya un método que indique si el estudiante 
aprueba (si la calificación es mayor o igual a 3.0). En el método principal, cree cuatro estudiantes, asígneles valores y almacenelos 
en un arreglo, muestre la nota mas baja y la nota mas alta."
 */
public class Estudiante {
    public String nombre;
    public String asignatura;
    public double calificacionFinal;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;
    }

    public Estudiante(String nombre, String asignatura, double calificacionFinal) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.calificacionFinal = calificacionFinal;
    }
    
    public void mostrarInformacion(){
        System.out.println(this.nombre + " en la materia " + this.asignatura + " tuviste una calificacion de " + this.calificacionFinal);
        System.out.println("aprobaste? " + verificarAprobacion ());
    }
    
    public boolean verificarAprobacion (){
        boolean isAprobado = false;
        if (this.calificacionFinal > 0) {
            if (this.calificacionFinal >= 3) {
            isAprobado =  true;
            }
        }
        return isAprobado;
    }
}
