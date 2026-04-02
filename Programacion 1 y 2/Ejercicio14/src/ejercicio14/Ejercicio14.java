/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/*6. Los días de la semana van del domingo al sábado y se representan con números, 
donde el domingo es el número 1 y el sábado el número 7. Ahora, pide un número en el teclado y muestra el día que representa. Usa un interruptor.
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Semana semana1 = new Semana(4);
        System.out.println("semana1 = " + semana1.mostrarDia());
    }
    
}
