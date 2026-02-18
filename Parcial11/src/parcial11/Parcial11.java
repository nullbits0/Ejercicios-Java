/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial11;

/*"En un hospital, un termómetro mide la temperatura en grados Celsius, pero algunos doctores la prefieren en Fahrenheit. 
El programa pide al usuario ingresar una lista de  temperaturas en Celsius, pero muestre su equivalente en 
Fahrenheit. Fórmula: F = (C * 9/5) + 32. Ademas muestre el promedio de las temperaturas."
 */
public class Parcial11 {

    public static void main(String[] args) {
        double[] temperaturas = {36, 37.5, 39, 40, 41, 40.6, 35};
        Fahrenheit fahrenheit1 = new Fahrenheit(temperaturas);
        fahrenheit1.traducirTemperatura();
        fahrenheit1.mostarTemperatura();
        System.out.println("fahrenheit1 = " + fahrenheit1.promediarTemperaturas());
    }
    
}
