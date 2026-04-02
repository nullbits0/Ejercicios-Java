class Personas {
    String nombre;
    int edad;
    
    Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class PersonaPR {
    public static void main(String[] args) {
        Personas persona = new Personas("Ana", 25);
        System.out.println("ANTES: " + persona.nombre + " - " + persona.edad);
        
        cumpleanios(persona); 
        
        System.out.println("DESPUÉS: " + persona.nombre + " - " + persona.edad);
    }
    
    public static void cumpleanios(Personas p) {
        p.edad += 1; 
        p.nombre = p.nombre.toUpperCase(); 
    }
}