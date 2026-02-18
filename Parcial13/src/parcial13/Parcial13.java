/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Parcial13 {

    public static void main(String[] args) {
        Propina propina1 = new Propina(50000, true, true, 20);
        System.out.println("propina1 = " + propina1.calcularPropina());
        System.out.println("propina1 = " + propina1.cuenta);
        
        Propina propina2 = new Propina(50000, false, true,17);
        Propina propina3 = new Propina(30000, true, false,26);
        Propina propina4 = new Propina(65000, true, false,21);
        
        Propina[] clientes = {propina1,propina2,propina3,propina4};
        
        Propina.rellenarListaNombreClientes(clientes);
        
        System.out.println("clientes = " + Propina.contarPropinas(clientes));
        System.out.println("clientes = " + (clientes.length-Propina.contarPropinas(clientes)));
        
        //ejercicio 15
        
        String mayor = Propina.verificarMayorPropina(clientes);
        
        System.out.println("mayor propina = " + mayor);
        
        //ejercicio 16
        
        String menor = Propina.verificarMenorPropina(clientes);
        
        System.out.println("menor propina = " + menor);
        
        //ejercicio 17
        
        System.out.println("clientes mujeres = " + Propina.contarMujeres(clientes));
        
        //ejercicio 18
        
        System.out.println("clientes menor edad = " + Propina.contarMenorEdad(clientes));
        
    }
    
}
