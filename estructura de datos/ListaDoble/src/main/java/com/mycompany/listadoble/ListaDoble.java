/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listadoble;

import javax.swing.JOptionPane;

public class ListaDoble {

    NodoDoble inicio;

    public void crearInicio(int dato) {
        NodoDoble nuevo = new NodoDoble();
        nuevo.setAtras(null);
        nuevo.setAdelante(null);
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setAdelante(inicio);
            inicio.setAtras(nuevo);
            inicio = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Nodo agregado correctamente");
    }

    public void imprimir() {
        NodoDoble temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            do {
                JOptionPane.showMessageDialog(null,
                        "Dato: " + temporal.getDato());
                temporal = temporal.getAdelante();
            } while (temporal != null);
        }
    }

    public void buscar(int bus) {
        NodoDoble temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            do {
                if (bus == temporal.getDato()) {
                    if (temporal.getAtras() == null && temporal.getAdelante() == null) {
                        JOptionPane.showMessageDialog(null, "Nodo unico, no tiene vecinos");
                    } else if (temporal.getAtras() == null) {
                        JOptionPane.showMessageDialog(null, "Adelante: " + temporal.getAdelante().getDato() + "; Atras: Ninguno");
                    } else if (temporal.getAdelante() == null) {
                        JOptionPane.showMessageDialog(null, "Adelante: Ninguno; Atras: " + temporal.getAtras().getDato());
                    } else {
                        JOptionPane.showMessageDialog(null, "Adelante: " + temporal.getAdelante().getDato() + "; Atras: " + temporal.getAtras().getDato());
                    }
                }
                temporal = temporal.getAdelante();
            } while (temporal != null);
        }
    }
    
    public void ultimo(int dato){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setDato(dato);
        nuevo.setAdelante(null);
        nuevo.setAtras(null);
        
        NodoDoble temporal = inicio;
        
        if (inicio == null) {
            inicio = nuevo;
        }else{
            while(temporal.getAdelante() != null){
                temporal = temporal.getAdelante();    
            }
            temporal.setAdelante(nuevo);
            nuevo.setAtras(temporal);
        }
        JOptionPane.showMessageDialog(null, "Nodo agregado correctamente");
    }
    
    public void adelante(int dato, int buscar){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setDato(dato);
        nuevo.setAdelante(null);
        nuevo.setAtras(null);
        
        NodoDoble temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            do {
                if (buscar == temporal.getDato()) {
                    nuevo.setAdelante(temporal.getAdelante());
                    nuevo.setAtras(temporal);
                    if (temporal.getAdelante() != null) {
                        temporal.getAdelante().setAtras(nuevo);
                    }
                    temporal.setAdelante(nuevo);
                    JOptionPane.showMessageDialog(null, "Nodo agregado correctamente");
                    return; 
                }
                temporal = temporal.getAdelante(); 
            } while (temporal != null);

            JOptionPane.showMessageDialog(null, "El valor no existe en esta lista"); 
        }
    }
    
    public void atras(int dato, int buscar){
        NodoDoble nuevo = new NodoDoble();
        nuevo.setDato(dato);
        nuevo.setAdelante(null);
        nuevo.setAtras(null);
        
        NodoDoble temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            do {
                if (buscar == temporal.getDato()) {
                    nuevo.setAtras(temporal.getAtras());
                    nuevo.setAdelante(temporal);
                    if (temporal.getAtras() != null) {
                        temporal.getAtras().setAdelante(nuevo);
                    } else {
                        inicio = nuevo; 
                    }
                    temporal.setAtras(nuevo);
                    JOptionPane.showMessageDialog(null, "Nodo agregado correctamente");
                    return; 
                }
                temporal = temporal.getAdelante();
            } while (temporal != null);

            JOptionPane.showMessageDialog(null, "El valor no existe en esta lista");
        }
    }
    
    public void eliminar(int buscar){
        NodoDoble temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        } else { 
            do {
                if (buscar == temporal.getDato()) {
                    if (temporal.getAtras()==null && temporal.getAdelante() == null) {
                        inicio = null;
                    }else if(temporal.getAtras() == null){
                        inicio = temporal.getAdelante();
                        inicio.setAtras(null);
                    }else if(temporal.getAdelante() == null){
                        temporal.getAtras().setAdelante(null);
                    }else{
                        temporal.getAdelante().setAtras(temporal.getAtras());
                        temporal.getAtras().setAdelante(temporal.getAdelante());
                    }  
                    JOptionPane.showMessageDialog(null, "Nodo eliminado correctamente");
                    return;
                }
                temporal = temporal.getAdelante();
            } while (temporal != null);
        }
        JOptionPane.showMessageDialog(null, "El valor no existe en esta lista");
    }

}
