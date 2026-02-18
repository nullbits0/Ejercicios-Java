/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial9;

/*"Un estudiante desea conocer su promedio. Se debe crear un objeto con el atributo codigo, y un atributo en donde almacene 
una matriz con las materias y su correspondiente calificacion. Ademas muestre la materia con la mejor nota y la materia con la peor nota."
 */
public class Parcial9 {

    public static void main(String[] args) {
        String[] listaMaterias1 = new String[3];
        Parcial9.rellenarListaMaterias(listaMaterias1);
        double[] listaCalificaciones1= new double[3];
        Parcial9.rellenarListaCalificaciones(listaCalificaciones1);
        Estudiante estudiante1 =new Estudiante("192478",listaMaterias1,listaCalificaciones1);
        System.out.println("estudiante1 = " + estudiante1.encontrarMejorNota());
        System.out.println("estudiante1 = " + estudiante1.encontrarPeorNota());
    }
    public static void rellenarListaMaterias(String[] listaMaterias1){
        listaMaterias1[0] = "programacion";
        listaMaterias1[1] = "programacion";
        listaMaterias1[2] = "programacion";
    }
    public static void rellenarListaCalificaciones(double[] listaCalificaciones1){
        listaCalificaciones1[0] = 2;
        listaCalificaciones1[1] = 3;
        listaCalificaciones1[2] = 2.9;
    }
    
}
