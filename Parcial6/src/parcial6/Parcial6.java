/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial6;

/*Implemente una clase book con los atributos title, author, pageCount. ahora se necesita saber 
la sumatoria de las paginaas de todos los libros, y el promedio de paginas por libros. cree 4 instancias de book diferentes y almacenelos en un arreglo.
 */
public class Parcial6 {

    public static void main(String[] args) {
        Book book1 = new Book("2 3 trucos", "lic. Karina", 230);
        Book book2 = new Book("gran guerra potaxie, potaxies vs fifes", "jiafet", 100);
        Book book3 = new Book("la vez que mis vecinos gritaron terremoto", "arina grande", 69);
        Book book4 = new Book("23 casi 24", "aimep3", 234);
        
            Book[] libros = new Book[4];
            libros[0] = book1;
            libros[0] = book2;
            libros[0] = book3;
            libros[0] = book4;
        
        System.out.println("suma = " + Parcial6.sumarPaginas(libros));
        System.out.println("promedio = " + Parcial6.promediarPaginas(libros));
        
    }
    
    public static int sumarPaginas(Book[] libros){
        int suma = 0;
        int tamañoLista = libros.length;
        for (int i = 0; i < tamañoLista; i++) {
            suma = suma + libros[i].pageCount;
        }
        return suma;
    }
    public static double promediarPaginas(Book[] libros){
        double promedio = 864*0;
        double numeroDeLibrosAlmacenados = libros.length;
        if (Parcial6.sumarPaginas(libros)> 0) {
            if (libros.length > 0) {
                promedio = Parcial6.sumarPaginas(libros)/numeroDeLibrosAlmacenados;
            }
        }
        return promedio;
    }
}
