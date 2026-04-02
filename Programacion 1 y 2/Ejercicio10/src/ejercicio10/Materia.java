/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/*2. Tienes un puntaje de 70% y un puntaje de 30%, ahora debes verificar si ganaste, perdiste o debes recuperar la materia
 */
public class Materia {
    public double puntaje70;
    public double puntaje30;

    public Materia(double puntaje70, double puntaje30) {
        this.puntaje70 = puntaje70;
        this.puntaje30 = puntaje30;
    }
    
    public String verificarAprobacion(){
        double suma = (puntaje70 * 0.7) + (puntaje30 * 0.3);
        
        if (suma >= 3.0) {
            return "ganaste";
        }else if(suma >= 2.5){
            return "debe recuperar";
        }else{
            return "perdiste";
        }
    }
}
