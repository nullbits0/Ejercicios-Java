/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/*4. Necesitas calcular el salario a pagar a un trabajador, tienes el numero de días trabajados y el valor del día.
 */
public class Salario {
    public int diasTrabajados;
    public double valorDia;

    public Salario(int diasTrabajados, double valorDia) {
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }
    
    public double calcularSalario(){
        return diasTrabajados * valorDia;
    }
}
