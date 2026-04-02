/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/*3. Datos demográficos:
Se almacenan los siguientes datos sobre una persona: su nombre, su segundo nombre, 
su primer apellido, su segundo apellido, su edad, su altura en metros, su sexo (F para mujer y M para hombre) y se pregunta si está casada.
 */
public class Persona {
    public String primerNombre;
    public String segundoNombre;
    public String primerApellido;
    public String segundoApellido;
    public int edad;
    public double altura;
    public char sexo;
    public boolean isCasada;

    public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad, double altura, char sexo, boolean isCasada) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.isCasada = isCasada;
    }
    
    
}
