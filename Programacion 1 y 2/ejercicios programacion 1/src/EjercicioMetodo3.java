class Persona {
    String nombre; 
}
public class EjercicioMetodo3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "beyonce";
        cambiarpersona(persona);
        System.out.println("el nombre es " + persona.nombre);
    }
    public static void cambiarpersona(Persona persona){
        persona = new Persona();
        persona.nombre = "Becky G";
        System.out.println("el renombrado es " + persona.nombre);
    }
}
