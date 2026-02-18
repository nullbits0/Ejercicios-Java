/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/*1. Solicita un dígito mediante el teclado y muestra su valor en palabras en la consola.
 */
public class Traductor {
    public int numero;
    public String[] numeros = rellenarLista();

    public Traductor(int numero) {
        this.numero = numero;
    }
    
    public String[] rellenarLista(){
        String[] numeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        return numeros;
    }
    
    public String traducirNumero(){
        return numeros[numero];
    }
}
