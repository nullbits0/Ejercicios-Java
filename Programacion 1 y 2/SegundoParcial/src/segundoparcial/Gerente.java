/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcial;

/**
 *
 * @author juane
 */
public class Gerente extends Empleado{
    private String departamento;
    public Gerente(String departamento, String nombres, String documento, double sueldoBasico) {
        super(nombres, documento, sueldoBasico);
        this.setDepartamento(departamento);
    }
    public Gerente(String departamento, String nombres, String documento, double sueldoBasico, boolean esCasado) {
        super(nombres, documento, sueldoBasico, esCasado);
        this.setDepartamento(departamento);
    }
    @Override
    public void calcularTotalPagar(){
        double total = 0;
        if (this.sueldoBasico > Empleado.getSueldoMinimo()) {
            total = this.sueldoBasico;
            System.out.println("su sueldo es = " + total);
        }else {
            total = this.sueldoBasico + Empleado.BONO_DE_NAVIDAD;
            System.out.println("su sueldo es = " + total);
        }
  
    } 
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 
}
