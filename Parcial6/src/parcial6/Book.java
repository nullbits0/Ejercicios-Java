/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial6;

/*Implemente una clase book con los atributos title, author, pageCount. ahora se necesita saber 
la sumatoria de las paginas de todos los libros, y el promedio de paginas por libros. cree 4 instancias de book diferentes y almacenelos en un arreglo.
 */
public class Book {
    public String title;
    public String author;
    public int pageCount;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    
    
}
