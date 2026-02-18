/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/*6. Los días de la semana van del domingo al sábado y se representan con números, 
donde el domingo es el número 1 y el sábado el número 7. Ahora, pide un número en el teclado y muestra el día que representa. Usa un interruptor.
 */
public class Semana {
    public int numero;

    public Semana(int numero) {
        this.numero = numero;
    }
    
    public String mostrarDia(){
        switch(numero){
            case 1:
                return "domingo";
            case 2:
                return "lunes";
            case 3:
                return "martes";
            case 4:
                return "miercoles";
            case 5:
                return "jueves";
            case 6:
                return "viernes";
            case 7:
                return "sabado";
            default:
                return "dia no existente";
        }
    }
}
