class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
}
public class AutorLibroPR {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez");
        System.out.println("ANTES: " + libro.titulo + " - Autor: " + libro.autor);

        cambiarAutor(libro);
        System.out.println("DESPUES: " + libro.titulo + " - Autor: " + libro.autor);
    }
    public static void cambiarAutor(Libro l){
        l.autor = "Mario Vargas Llosa";
    }
}
