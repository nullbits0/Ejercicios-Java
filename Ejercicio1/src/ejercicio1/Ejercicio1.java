/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/*1. Describe un producto de supermercado: nombre del producto, precio sin IVA, preguntar si aplica IVA, precio con IVA y existencias.
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Producto producto1 = new Producto("choclitos", 2450, true, 84);
        
        System.out.println("producto1 = " + producto1.aplicarIva());
    }
    
}
