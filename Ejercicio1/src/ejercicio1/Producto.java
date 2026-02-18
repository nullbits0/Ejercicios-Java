/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/*1. Describe un producto de supermercado: nombre del producto, precio sin IVA, preguntar si aplica IVA, precio con IVA y existencias.
 */
public class Producto {
    public String nombre;
    public double precio;
    public boolean tieneIva;
    public int stock;
    

    public Producto(String nombre, double precio, boolean tieneIva, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.tieneIva = tieneIva;
        this.stock = stock;
    }
    
    public double aplicarIva(){
        if (tieneIva) {
            return precio * 1.21;
        }
        return precio;
    }
}
