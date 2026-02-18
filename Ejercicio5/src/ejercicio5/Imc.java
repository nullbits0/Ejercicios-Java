/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/*5. Un médico necesita encontrar el IMC de los pacientes, verificar la fórmula del IMC con sus colegas o en Internet.
 */
public class Imc {
    public double altura;
    public double peso;

    public Imc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }
    
    public double calcularImc(){
        return peso / (altura * altura);
    }
}
