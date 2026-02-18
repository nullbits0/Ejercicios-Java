/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial4;

/*"Cree una clase Persona con los atributos nombre, apellido y documento. Debe crear un metodo en donde verifique si el documento 
de una persona empieza por mil millones. En el método principal, cree tres instancias de Persona, almacenelas en un arreglo y 
cuente cuantos documentos son menores a mil millones."
 */
public class Persona {
    public String nombre;
    public String apellido;
    public double documento;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona(String nombre, String apellido, double documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    public void mostrarInformacion(){
        System.out.println("hola, " + this.nombre + " " + this.apellido);
        System.out.println("tu documento " + this.documento + " empieza por mil millones? " + verificarDocumento ());
    }
    
    public boolean verificarDocumento (){
        int milMillones = 1000000000;
        int dosMillones = 2000000000;
        boolean isCorrecto = false;
        if (documento >= milMillones) {
            if (documento <= dosMillones) {
                return isCorrecto;
            }
            isCorrecto = true;
            return isCorrecto;
        }
        return isCorrecto;
    }
    
    public static int contarCuantosMenoresMilMillones(Persona[] personas){
        int contador = 0;
        int tamañoLista = personas.length;
        for (int i = 0; i < tamañoLista; i++) {
            if (personas[i].verificarDocumento() == false) {
                contador++;
            }
        }
        return contador;
    }
    
}
