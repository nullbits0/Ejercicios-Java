/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multicapa6;

import java.util.Scanner;


public class Calculo {
    
    static int diasSemana = 5;
    static int valorHora = 4000;
    
    public static int horasTrabajadas (){
        Scanner sc = new Scanner(System.in);
        
        int sumaHoras = 0;
        
        for (int i = 0; i < Calculo.diasSemana; i++) {
            int horaDia = sc.nextInt();
            sumaHoras += horaDia;
        }
        return sumaHoras;
    }
    public static int sueldo (int sumaHoras){
        return sumaHoras * Calculo.valorHora;
    }
}
