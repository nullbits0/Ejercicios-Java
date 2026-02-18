/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/*4. Un profesor quiere saber la edad promedio de las mujeres de su clase y verificar si son menores de 18 años.
De los 20 estudiantes, 15 son hombres.
 */
public class Estudiante {
    public int cantidadEstudiantes;
    public int cantidadEstudiantesHombres;
    public int tamañoLista ;
    public int[] edades;
    

    public Estudiante(int cantidadEstudiantes, int cantidadEstudiantesHombres) {
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.cantidadEstudiantesHombres = cantidadEstudiantesHombres;
        this.tamañoLista = cantidadEstudiantes - cantidadEstudiantesHombres;
        this.edades = new int[tamañoLista];
    }
    
    public void rellenarEdadesMujeres(){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < tamañoLista; i++) {
            edades[i] = sc.nextInt();
        }
    }
    
    public double calcularPromedioMujeres(){
        int suma = 0;
        for(int edad : edades){
            suma += edad;
        }
        return suma/tamañoLista;
    }
    public int verificarMayoriaEdad(){
        int contador = 0;
        for(int edad : edades){
            if (edad >= 18) {
                contador++;
            }
        }
        return contador;
    }
}
