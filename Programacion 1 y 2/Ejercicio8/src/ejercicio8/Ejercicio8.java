/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/*8. Si viajo a 10 km/h y lanzo una piedra a una velocidad de 5 km/h, ¿cuál es la velocidad de la piedra desde la perspectiva de un espectador?
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Velocidad velocidad1 = new Velocidad(10, 5);
        System.out.println("velocidad1 = " + velocidad1.calcularVelocidad());
    }
    
}
