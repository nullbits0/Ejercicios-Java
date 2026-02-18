/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial4;

/*"Cree una clase Persona con los atributos nombre, apellido y documento. Debe crear un metodo en donde verifique si el documento 
de una persona empieza por mil millones. En el método principal, cree tres instancias de Persona, almacenelas en un arreglo y 
cuente cuantos documentos son menores a mil millones."
 */
public class Parcial4 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("lara", "raj", 1098765432);
        Persona persona2 = new Persona("sussie", "caramelo", 123456789);
        Persona persona3 = new Persona("doja", "cat", 2134567890);
        
        Persona[] personas = {persona1, persona2, persona3};
        
        System.out.println("los documentos menores a mil millones son: " + Persona.contarCuantosMenoresMilMillones(personas));
    }
    
}
