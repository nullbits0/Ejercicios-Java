/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotrece;

/*5. solicitaras un numero del teclado y comprobaras si es par, impar o negativo. usa if, else if y else
 */
public class Numero {
    public int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    
    public String clasificarNumero(){
        if (numero % 2 == 0 && numero > 0) {
            return "par";
        }else if (numero < 0){
            return "negativo";
        }else{
            return "impar";
        }
    }
}
