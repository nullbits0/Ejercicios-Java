/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial10;

/*"Simula una retirada de efectivo de un cajero automático. El usuario tiene un saldo inicial (por ejemplo, 1000000). 
Pregúntele cuánto desea retirar. Si el retiro es menor o igual al saldo realice la operacion y muestre el saldo restante. 
De lo contrario, muestre un mensaje de fondos insuficientes."
 */
public class Retirar {
    public double saldoInicial;
    public double saldoRetirar;

    public Retirar(double saldoInicial, double saldoRetirar) {
        this.saldoInicial = saldoInicial;
        this.saldoRetirar = saldoRetirar;
    }

    public Retirar(double saldoRetirar) {
        this.saldoInicial = 100000;
        this.saldoRetirar = saldoRetirar;
    }
    
    public String mostrarInformacion(){
        String mensaje = "saldo actual es de: " + this.saldoInicial;
        return mensaje;
    }
    
    public String retirarSaldo(){
        String mensaje = "este mensaje es un error de sistema, si le aparece algo esta ocurriendo en su codigo, por favor revisar";
        if (this.saldoRetirar <= this.saldoInicial) {
            double restar = this.saldoInicial-this.saldoRetirar;
            mensaje = "a tu saldo inicial de " + this.saldoInicial + " se le quitaran " + this.saldoRetirar + " y tu saldo restante sera de " + restar;
            return mensaje;
        }else if(this.saldoRetirar == this.saldoInicial){
            double restar = this.saldoInicial-this.saldoRetirar;
            mensaje = "saldo restante " + restar;
            return mensaje;  
        }else{
            mensaje = "saldo insuficiente";
            return mensaje;
        }
        
    }
}
