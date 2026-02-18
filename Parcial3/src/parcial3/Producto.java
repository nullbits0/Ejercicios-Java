/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3;

/*"Implemente una clase Producto con los atributos nombre, precio y cantidad en stock. Cree métodos para mostrar la información 
del producto y ajustar el stock (añadir o restar).
En el método principal, cree dos productos, muestre su información y ajuste el stock mediante los métodos."
 */
public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void mostrarInformacion(){
        System.out.println("informacion = " + this.nombre);
        System.out.println("precio del producto: " + this.precio);
        System.out.println("stock del producto: " + this.stock);
    }
    
    public int añadirStock (int añadido){
        if (añadido < 0) {
            this.stock *= 10000;
        }
        stock = this.stock + añadido;
        return stock;
    } 
    
    public int restarStock (int disminuido){
        if (disminuido < stock) {
            stock =this.stock - disminuido;
        }
        return stock;
    } 
}
