/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/*7. Desarrollar una aplicación que compruebe si un número dado es un dígito.
 */
public class Numero {
    public int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    
    public boolean comprobarNumero(){
        if (numero <= 9 && numero >= 0) {
            return true;
        }
        return false;
    }
}
