/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/*8. Si viajo a 10 km/h y lanzo una piedra a una velocidad de 5 km/h, ¿cuál es la velocidad de la piedra desde la perspectiva de un espectador?
 */
public class Velocidad {
    public double miVelocidad;
    public double velocidadPiedra;

    public Velocidad(double miVelocidad, double velocidadPiedra) {
        this.miVelocidad = miVelocidad;
        this.velocidadPiedra = velocidadPiedra;
    }
    
    public double calcularVelocidad(){
        return miVelocidad + velocidadPiedra;
    }
}
