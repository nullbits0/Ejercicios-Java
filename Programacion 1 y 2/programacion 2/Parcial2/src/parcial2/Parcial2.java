/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;

/*diseñe una clase Vehiculo con los atributos dueño, modelo y año. 
implemente un metodo para determinar el tiempo transcurrido desde su fabricacion. En el metodo principal, cree dos vehiculos e invoque el metodo.
 */
public class Parcial2 {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("vergonia", "ford", 1990);
        Vehiculo vehiculo2 = new Vehiculo("lara", "mustag", 1980);
        
        System.out.println("vehiculo1 = " + vehiculo1.calcularTiempoTranscurrido(2025));
        vehiculo1.mostrarInformacion();
        System.out.println("vehiculo2 = " + vehiculo2.calcularTiempoTranscurrido(2025));
        vehiculo2.mostrarInformacion();
    }
    
}
