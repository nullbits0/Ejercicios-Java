/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapoo;

import java.util.Scanner;

/*1. Un restaurante quiere que los camareros ayuden a los clientes a calcular las propinas.  
Le pide al usuario el importe total de la cuenta y el porcentaje de propina.  Muestra la cantidad con y sin propina en la pantalla.																					
*/
public class PracticaPOO {
    
    public static int tarifaHora = 5000;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int sumaHora = 0;
       int cantidadDias = 5;
       
       System.out.println("horas trabajadas de lunes hasta el viernes");
        
        for (int i = 0; i < cantidadDias; i++) {
            int hora = sc.nextInt();
            sumaHora += hora;
        }
        
        System.out.println("sumaHora = " + sumaHora);
        
        int salarioTotal = PracticaPOO.salarioSemanal(sumaHora);
        
        System.out.println("salarioTotal = " + salarioTotal);
        
    }
    public static int salarioSemanal (int sumaHora){
        return sumaHora * PracticaPOO.tarifaHora;
    }
    
}
