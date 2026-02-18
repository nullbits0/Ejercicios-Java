/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/*1. enseñale las vocales al sistema, almacenalas en una lista, luego pedir una letra en el teclado y comprobar si es una vocal.
 */
public class Vocales {
    public char letra;
    public char[] vocales;

    public Vocales(char letra) {
        this.letra = letra;
        this.vocales = rellenarLista();
    }
    
    public char[] rellenarLista(){
        char[] vocales = {'a','e','i','o','u'};
        return vocales;
    }
    public boolean comprobarVocal(){
        for(char vocal : vocales){
            if (vocal == letra) {
                return true;
            }
        }
        return false;
    }
}
