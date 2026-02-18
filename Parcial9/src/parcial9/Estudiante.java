/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial9;

/*"Un estudiante desea conocer su promedio. Se debe crear un objeto con el atributo codigo, y un atributo en donde almacene 
una matriz con las materias y su correspondiente calificacion. Ademas muestre la materia con la mejor nota y la materia con la peor nota."
 */
public class Estudiante {
    public String codigo;
    public String[] materias;
    public double[] calificaciones;

    public Estudiante(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante(String codigo, String[] materias) {
        this.codigo = codigo;
        this.materias = materias;
    }

    public Estudiante(String codigo, String[] materias, double[] calificaciones) {
        this.codigo = codigo;
        this.materias = materias;
        this.calificaciones = calificaciones;
    }
    
    public String encontrarMejorNota(){
        double mejorNota = 0;
        String materia = "este mensaje es un error de sistema, si le aparece algo esta ocurriendo en su codigo, por favor revisar";
        int tamanoLista = calificaciones.length;
        for (int i = 0; i < tamanoLista; i++) {
            if (calificaciones[i] > mejorNota) {
                mejorNota = calificaciones[i];
                materia = materias[i];
            }
        }
        return materia;
    }
    
    public String encontrarPeorNota(){
        double peorNota = calificaciones[0];
        String materia = "este mensaje es un error de sistema, si le aparece algo esta ocurriendo en su codigo, por favor revisar";
        int tamanoLista = calificaciones.length;
        for (int i = 0; i < tamanoLista; i++) {
            if (calificaciones[i] < peorNota) {
                peorNota = calificaciones[i];
                materia = materias[i];
            }
        }
        return materia;
    }
}
