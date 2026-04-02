/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial5;

/*"Cree una clase Estudiante con los atributos nombre, asignatura y calificación final. Incluya un método que indique si el estudiante 
aprueba (si la calificación es mayor o igual a 3.0). En el método principal, cree cuatro estudiantes, asígneles valores y almacenelos 
en un arreglo, muestre la nota mas baja y la nota mas alta."
 */
public class Parcial5 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("daniella", "programacion",5);
        Estudiante estudiante2 = new Estudiante("donatella", "programacion",2.4);
        Estudiante estudiante3 = new Estudiante("yasuri", "programacion",3);
        Estudiante estudiante4 = new Estudiante("gabriela", "programacion",1);
        
        Estudiante[] estudiantes = {estudiante1,estudiante2,estudiante3,estudiante4};
        
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
        estudiante4.mostrarInformacion();
        
        System.out.println("nota Mayor = " + Parcial5.comprobarNotaMayor(estudiantes));
        System.out.println("nota Menor = " + Parcial5.comprobarNotaMenor(estudiantes));
        
        
    }
    public static double comprobarNotaMayor(Estudiante[] estudiantes){
        double notaMayor = 0;
        int tamañoLista = estudiantes.length;
        for (int i = 0; i < tamañoLista; i++) {
            if (estudiantes[i].calificacionFinal > notaMayor ) {
                notaMayor  = estudiantes[i].calificacionFinal;
            }
        }
        return notaMayor;
    }
    public static double comprobarNotaMenor(Estudiante[] estudiantes){
        double notaMenor = Parcial5.comprobarNotaMayor(estudiantes);
        int tamañoLista = estudiantes.length;
        for (int i = 0; i < tamañoLista; i++) {
             if (estudiantes[i].calificacionFinal < notaMenor  ) {
                notaMenor   = estudiantes[i].calificacionFinal;
            }
        }
        return notaMenor;
    }
}
