/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3;

/*"Implemente una clase Producto con los atributos nombre, precio y cantidad en stock. Cree métodos para mostrar la información 
del producto y ajustar el stock (añadir o restar).
En el método principal, cree dos productos, muestre su información y ajuste el stock mediante los métodos."
 */
public class Parcial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto ("minichips", 1400, 5);
        producto1.mostrarInformacion();
        System.out.println("producto1 = " + producto1.añadirStock(10));
        System.out.println("producto1 = " + producto1.restarStock(7));
        
    }
    
}
