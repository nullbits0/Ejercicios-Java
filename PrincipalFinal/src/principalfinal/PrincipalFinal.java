/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principalfinal;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class PrincipalFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nequi nequi1 = new Nequi();
        Nequi nequi2 = new Nequi();
        TarjetaCredito tc1 = new TarjetaCredito();
        
        ArrayList<Pagable>formasPago = new ArrayList<Pagable>();
        
        formasPago.add(nequi1);
        formasPago.add(nequi2);
        formasPago.add(tc1);
        
        SistemaPago sp = new SistemaPago();
        sp.mostrarMensaje(formasPago);
        
    }
    
}
