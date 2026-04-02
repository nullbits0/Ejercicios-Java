/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcial;

/**
 *
 * @author juane
 */
public class Empleado {
    protected String nombres;
    protected String documento;
    protected double sueldoBasico;
    protected boolean esCasado;
    public static double sueldoMinimo =1423500;
    public static final double BONO_DE_NAVIDAD = 500000; 
    public Empleado(String nombres, String documento, double sueldoBasico) {
        this.setNombres(nombres);
        this.setDocumento(documento);
        this.setSueldoBasico(sueldoBasico);
    }
    public Empleado(String nombres, String documento, double sueldoBasico, boolean esCasado) {
        this.setNombres(nombres);
        this.setDocumento(documento);
        this.setSueldoBasico(sueldoBasico);
        this.setEsCasado(esCasado);
    }
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
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public boolean isEsCasado() {
        return esCasado;
    }
    public void setEsCasado(boolean esCasado) {
        this.esCasado = esCasado;
    }
    public static double getSueldoMinimo() {
        return sueldoMinimo;
    }
    public static void setSueldoMinimo(double sueldoMinimo) {
        Empleado.sueldoMinimo = sueldoMinimo;
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombres=" + nombres + ", documento=" + documento + ", sueldoBasico=" + sueldoBasico + ", esCasado=" + esCasado + '}';
    }
    
}
