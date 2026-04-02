/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principalfinal;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class SistemaPago {
    public void mostrarMensaje(ArrayList<Pagable>formasPago){
        for (Pagable fp : formasPago){
            fp.mensaje();
        }        
    }
    
}
