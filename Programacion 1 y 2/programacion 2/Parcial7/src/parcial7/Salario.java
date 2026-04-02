/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial7;

/*7."Los empleados desean saber cuánto ganarán a la semana. El programa debería preguntar cuántas horas trabajó cada día de 
la semana (de lunes a viernes)  y enseñar la tarifa por hora en el sistema. Al final, se muestran el total de horas trabajadas y el 
salario de cada empleado. Adicionalmente se necesita saber cuanto dinero en total desembolso la empresa."
8.* Del ejercicio anterior debe mostrar cual fue el dia en el que mas se trabajo y el dia enque menos se trabajo
 */
public class Salario {
    public double horaTrabajadaLunes;
    public double horaTrabajadaMartes;
    public double horaTrabajadaMiercoles;
    public double horaTrabajadaJueves;
    public double horaTrabajadaViernes;
    public double tarifaHora;
    public int tamañoListaHorasTrabajadas;
    public double[] horasTrabajadas;
    
    
    public Salario(double horaTrabajadaLunes, double horaTrabajadaMartes, double horaTrabajadaMiercoles, double horaTrabajadaJueves, double horaTrabajadaViernes) {
        this.horaTrabajadaLunes = horaTrabajadaLunes;
        this.horaTrabajadaMartes = horaTrabajadaMartes;
        this.horaTrabajadaMiercoles = horaTrabajadaMiercoles;
        this.horaTrabajadaJueves = horaTrabajadaJueves;
        this.horaTrabajadaViernes = horaTrabajadaViernes;
        this.tarifaHora = 7000;
        this.horasTrabajadas = new double[5];
    }
    
    public double calcularTotalHorasTrabajadas(){
        double suma = this.horaTrabajadaLunes +this.horaTrabajadaMartes + this.horaTrabajadaMiercoles + this.horaTrabajadaJueves + this.horaTrabajadaViernes;
        return suma;
    }
    
    public double calcularSalario(){
        double salario = this.tarifaHora;
        if (this.tarifaHora > 0) {
            salario = salario * calcularTotalHorasTrabajadas();
        }
        return salario;
    }
    
// punto 8
    public void listaHorasTrabajadas(){
        horasTrabajadas[0]= horaTrabajadaLunes;
        horasTrabajadas[1]= horaTrabajadaMartes;
        horasTrabajadas[2]= horaTrabajadaMiercoles;
        horasTrabajadas[3]= horaTrabajadaJueves;
        horasTrabajadas[4]= horaTrabajadaViernes;
    }
    
    public double diaMasTrabajado(){
        listaHorasTrabajadas();
        double diaMasTrabajado = horasTrabajadas[0];
        int tamañoLista = horasTrabajadas.length;
        for (int i = 0; i < tamañoLista; i++) {
            if(horasTrabajadas[i] > diaMasTrabajado){
                diaMasTrabajado = horasTrabajadas[i];
            }
        }
        return diaMasTrabajado;
    }

    public double diaMenosTrabajado(){
        listaHorasTrabajadas();
        double diaMenosTrabajado = horasTrabajadas[0]; 
        int tamañoLista = horasTrabajadas.length;
        for (int i = 0; i < tamañoLista; i++) {
            if(horasTrabajadas[i] < diaMenosTrabajado){
                diaMenosTrabajado = horasTrabajadas[i];
            }
        }
        return diaMenosTrabajado;  
    }
}
