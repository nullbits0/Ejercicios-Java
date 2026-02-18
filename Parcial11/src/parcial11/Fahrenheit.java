/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial11;

/*"En un hospital, un termómetro mide la temperatura en grados Celsius, pero algunos doctores la prefieren en Fahrenheit. 
El programa pide al usuario ingresar una lista de  temperaturas en Celsius, pero muestre su equivalente en 
Fahrenheit. Fórmula: F = (C * 9/5) + 32. Ademas muestre el promedio de las temperaturas."
 */
public class Fahrenheit {
    public double[] temperaturas;
    public double[] temperaturasFahrenheit;

    public Fahrenheit(double[] temperaturas) {
        this.temperaturas = temperaturas;
        this.temperaturasFahrenheit = new double[temperaturas.length];
    }
    
    public void traducirTemperatura(){
        temperaturasFahrenheit[0] = (temperaturas[0]*9/5)+32;
        temperaturasFahrenheit[1] = (temperaturas[1]*9/5)+32;
        temperaturasFahrenheit[2] = (temperaturas[2]*9/5)+32;
        temperaturasFahrenheit[3] = (temperaturas[3]*9/5)+32;
        temperaturasFahrenheit[4] = (temperaturas[4]*9/5)+32;
        temperaturasFahrenheit[5] = (temperaturas[5]*9/5)+32;
        temperaturasFahrenheit[6] = (temperaturas[6]*9/5)+32;
    }
    
    public void mostarTemperatura(){
        int tamañoLista = temperaturasFahrenheit.length;
        String mensaje = "este mensaje es un error, si aparece es porque su codigo tiene un error, revise por favor";
        double temperatura = 0.0;
        for (int i = 0; i < tamañoLista; i++) {
            temperatura = temperaturasFahrenheit[i];
            mensaje = "temperatura = " + temperatura;
            System.out.println(mensaje);
            
        }
    }
    
    public double promediarTemperaturas(){
        double suma = 0;
        int tamañoLista = temperaturasFahrenheit.length;
        for (int i = 0; i < tamañoLista; i++) {
            suma = suma + temperaturasFahrenheit[i];
        }
        double promedio =  suma/temperaturasFahrenheit.length;
        return promedio;
    }
}
