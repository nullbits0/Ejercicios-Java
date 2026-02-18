/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial13;

/*13."Un restaurante necesita que los camareros ayuden a los clientes a calcular las propinas, la cual viene dada por un porcentaje 
dado por el gerente. Muestra el total de la cuenta con y sin propina en la pantalla."
14. * Del ejercicio anterior debe crear una lista de clientes y contar cuantos dieron propina y cuanto no.
15. * Del ejercicio anterior debe mostrar al cliente que pago la propina mayor.
16. * Del ejercicio anterior debe mostrar al cliente que pago la propina menor.
17. * Del ejercicio anterior debe mostrar cuantos clientes eran mujeres.
18. * Del ejercicio anterior debe mostrar cuantos clientes eran menores de edad.
 */
public class Propina {
    public double cuenta;
    public boolean dioPropina;//ejercicio 14
    public boolean isMujer;
    public int edad;
    public String nombreClientes[];

    public Propina(double cuenta) {
        this.cuenta = cuenta;
    }

    public Propina(double cuenta, boolean dioPropina) {
        this.cuenta = cuenta;
        this.dioPropina = dioPropina;
    }

    public Propina(double cuenta, boolean dioPropina, boolean isMujer) {
        this.cuenta = cuenta;
        this.dioPropina = dioPropina;
        this.isMujer = isMujer;
    }

    public Propina(double cuenta, boolean dioPropina, boolean isMujer, int edad) {
        this.cuenta = cuenta;
        this.dioPropina = dioPropina;
        this.isMujer = isMujer;
        this.edad = edad;
        this.nombreClientes = new String[4];
    }
    
    public double calcularPropina(){
        double cuentaFinal = this.cuenta;
        if (dioPropina == true) {
            cuentaFinal = cuentaFinal * 1.15;
            return cuentaFinal;
        }
        return cuentaFinal;
    }
    
    //ejercicio 14
    public static int contarPropinas(Propina[] clientes){
        int dieronPropina = 0;
        int tamañoLista = clientes.length;
        for (int i = 0; i < tamañoLista; i++) {
            if (clientes[i].dioPropina == true) {
                dieronPropina = dieronPropina + 1;
            }
        }
        return dieronPropina;
    }
    
    //ejercicio 15 
    
    public static void rellenarListaNombreClientes(Propina[] clientes){
        clientes[0].nombreClientes[0] = "cliente1";
        clientes[1].nombreClientes[1] = "cliente2";
        clientes[2].nombreClientes[2] = "cliente3";
        clientes[3].nombreClientes[3] = "cliente4";
    }
    
    public static String verificarMayorPropina (Propina[] clientes){
        double mayor = 0;
        String NombreDelCliente = "este mensaje es un error, si aparece es porque su codigo tiene un error, revise por favor";
        int tamañoLista = clientes.length;
        for (int i = 0; i <tamañoLista; i++) {
            if (clientes[i].calcularPropina() > mayor) {
                if (clientes[i].dioPropina == true) {
                    mayor = clientes[i].calcularPropina();
                    NombreDelCliente = clientes[i].nombreClientes[i];
                }
            }
        }
        return NombreDelCliente; 
    }
    
    // ejercicio 16 
    
    public static String verificarMenorPropina (Propina[] clientes){ 
        double menorValor = 1000000; 
        String nombreMenor = "ninguno dio propina";
        int tamañoLista = clientes.length;
        for (int i = 0; i <tamañoLista; i++) {
            if (clientes[i].calcularPropina() < menorValor) {
                if (clientes[i].dioPropina == true) {
                    menorValor = clientes[i].calcularPropina();
                    nombreMenor = clientes[i].nombreClientes[i];
                } 
            }
        }
        return nombreMenor;
    }
    
    //ejercio 17
    
    public static int contarMujeres(Propina[] clientes){
        int mujeres = 0;
        int tamañoLista = clientes.length;
        for (int i = 0; i <tamañoLista; i++) {
            if (clientes[i].isMujer == true) {
                mujeres++;
            }
        }
        return mujeres;
        
    }
    
    //ejercicio 18
    
    public static int contarMenorEdad(Propina[] clientes){
        int menorEdad = 0;
        int tamañoLista = clientes.length;
        for (int i = 0; i <tamañoLista; i++) {
            if (clientes[i].edad < 18) {
                menorEdad++;
            }
        }
        return menorEdad;
            
    }
}