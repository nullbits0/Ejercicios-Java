/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotrece;

/* 5. solicitaras un numero del teclado y comprobaras si es par, impar o negativo. usa if, else if y else
 */
public class EjercicioTrece {

    public static void main(String[] args) {
        Numero numero1 = new Numero(4);
        System.out.println("numero1 = " + numero1.clasificarNumero());
        
        Numero numero2 = new Numero(5);
        System.out.println("numero2 = " + numero2.clasificarNumero());
        
        Numero numero3 = new Numero(-6);
        System.out.println("numero3 = " + numero3.clasificarNumero());
    }
    
}
