class Estudiante{
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
}
public class EstudiantesPR {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sara", 9.5);
        System.out.println("ANTES: " + estudiante.nombre + " - " + estudiante.nota);

        modificarEstudiante(estudiante);
        System.out.println("DESPUÉS: " + estudiante.nombre + " - " + estudiante.nota);
    }
    public static void modificarEstudiante(Estudiante e){
        e.nota = 7.0;
        e.nombre = "Juan";
        
    }
}
