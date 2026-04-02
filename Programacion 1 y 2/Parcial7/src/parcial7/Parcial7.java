/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial7;

/*7."Los empleados desean saber cuánto ganarán a la semana. El programa debería preguntar cuántas horas trabajó cada día de 
la semana (de lunes a viernes)  y enseñar la tarifa por hora en el sistema. Al final, se muestran el total de horas trabajadas y el 
salario de cada empleado. Adicionalmente se necesita saber cuanto dinero en total desembolso la empresa."
8.* Del ejercicio anterior debe mostrar cual fue el dia en el que mas se trabajo y el dia enque menos se trabajo
 */
public class Parcial7 {

    public static void main(String[] args) {
        Salario salario1 = new Salario(8,5,6,8,8);
        Salario salario2 = new Salario(6,6,7,7,9);
        
        Salario[] salarios = {salario1,salario2};
        
        System.out.println("salario1 = " + salario1.calcularTotalHorasTrabajadas());
        System.out.println("salario1 = " + salario1.calcularSalario());
        System.out.println("salario1 = " + salario1.diaMasTrabajado());
        System.out.println("salario1 = " + salario1.diaMenosTrabajado());
        System.out.println("salario2 = " + salario2.calcularTotalHorasTrabajadas());
        System.out.println("salario2 = " + salario2.calcularSalario());
        System.out.println("salario2 = " + salario2.diaMasTrabajado());
        System.out.println("salario2 = " + salario2.diaMenosTrabajado());
        
        double desembolsoTotalEmpresa = Parcial7.calcularDesembolsoEmpresa(salarios);
        
        System.out.println("desembolsoTotalEmpresa = " + desembolsoTotalEmpresa);
        
    }
    public static double calcularDesembolsoEmpresa(Salario[] salarios){
        double suma = 0;
        int tamañoLista = salarios.length;
        for (int i = 0; i < tamañoLista; i++) {
            suma+= salarios[i].calcularSalario();   
        }
        return suma;
    }
    
}
