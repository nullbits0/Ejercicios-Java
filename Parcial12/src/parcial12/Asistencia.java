/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial12;

import java.util.Scanner;

/*"Una profesora quiere saber cuántos alumnos asistieron hoy. La profe cuenta con el número total de alumnos matriculados y una lista 
de nombres de estudiantes con su respectiva asistencia,  luego pregunta uno por uno si asistió (true/false). Al final, muestra cuántos 
asistieron y cuántos faltaron."
 */
public class Asistencia {
    public String[] listaNombres;
    public int numeroEstudiantes;
    public boolean[] asistencias;

    public Asistencia(String[] listaNombres) {
        this.listaNombres = listaNombres;
        this.numeroEstudiantes = listaNombres.length;
        this.asistencias = new boolean[this.numeroEstudiantes];
    }
    
    public void tomarAsistencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("asistio " + listaNombres[0]);
        asistencias[0] = sc.nextBoolean();
        sc.nextLine();
        System.out.println("asistio " + listaNombres[1]);
        asistencias[1] = sc.nextBoolean();
        sc.nextLine();
        System.out.println("asistio " + listaNombres[2]);
        asistencias[2] = sc.nextBoolean();
        sc.nextLine();
        System.out.println("asistio " + listaNombres[3]);
        asistencias[3] = sc.nextBoolean();
        sc.nextLine();
    }
    
    public int contarSiAsistieron(){
        int asistieron = 0;
        for (int i = 0; i < this.numeroEstudiantes; i++) {
            if (this.asistencias[i] == true) {
                asistieron++;
            }
        }
        return asistieron;
    }
    
    public void mostarAsistencia(){
        System.out.println("asistieron = " + contarSiAsistieron());
        int noAsistieron = this.numeroEstudiantes - contarSiAsistieron();
        System.out.println("asistieron = " + noAsistieron);
    }
}
