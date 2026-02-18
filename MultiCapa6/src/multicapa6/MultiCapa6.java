/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multicapa6;

import java.util.Scanner;

/*
 */
public class MultiCapa6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese las horas trabajadas por dia");
        
        int sumaHoras = Calculo.horasTrabajadas();
        
        System.out.println("sumaHoras = " + sumaHoras);
        
        int sueldo = Calculo.sueldo(sumaHoras);
        
        System.out.println("sueldo = " + sueldo);
        
    }
    
}
