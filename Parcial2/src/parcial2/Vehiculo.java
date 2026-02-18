/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/*diseñe una clase Vehiculo con los atributos dueño, modelo y año. 
implemente un metodo para determinar el tiempo transcurrido desde su fabricacion. En el metodo principal, cree dos vehiculos e invoque el metodo.
 */
public class Vehiculo {
    public String dueño;
    public String modelo;
    public int year;

    public Vehiculo(String dueño) {
        this.dueño = dueño;
    }

    public Vehiculo(String dueño, String modelo) {
        this.dueño = dueño;
        this.modelo = modelo;
    }

    public Vehiculo(String dueño, String modelo, int year) {
        this.dueño = dueño;
        this.modelo = modelo;
        this.year = year;
    }
    
    public void mostrarInformacion(){
        System.out.println(this.dueño + " es el dueño del carro " + this.modelo + " del año " + this.year );
    }
    
    public int calcularTiempoTranscurrido (int yearActual){
        int calcularTiempoTranscurrido = 0;
        if (yearActual < year) {
            calcularTiempoTranscurrido = yearActual - year;
        }
        return calcularTiempoTranscurrido;
    }
}
