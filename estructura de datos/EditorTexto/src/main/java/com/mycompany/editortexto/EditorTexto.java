/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.editortexto;

/**
 *
 * @author UserJ
 */
public class EditorTexto {

    Nodo actual;
    Nodo inicio;

    public void agregarPalabra(String palabra) {
        Nodo nuevo = new Nodo();
        nuevo.setPalabra(palabra);
        nuevo.setAdelante(null);
        nuevo.setAtras(null);
        if (actual == null) {
            actual = nuevo;
            inicio = nuevo;
        } else {
            actual.setAdelante(null);
            
            actual.setAdelante(nuevo);
            nuevo.setAtras(actual);
            actual = nuevo;
        }
    }

    public String deshacer() {
        if (actual == null) return null;
        actual = actual.getAtras();
        return obtenerTextoHastaActual();
    }

    public String rehacer() {
        if (actual == null) {
            if (inicio != null) {
                actual = inicio;
                return obtenerTextoHastaActual();
            }
            return null;
        }
        if (actual.getAdelante() == null) return null; 
        
        actual = actual.getAdelante();
        return obtenerTextoHastaActual();
    }
    
    public String obtenerUltimaPalabra() {
        return (actual != null) ? actual.getPalabra() : null;
    }

    private String obtenerTextoHastaActual() {
        StringBuilder sb = new StringBuilder();
        Nodo temporal = inicio;
        while (temporal != null) {
            sb.append(temporal.getPalabra()).append(" ");
            if (temporal == actual) {
                break;
            }
            temporal = temporal.getAdelante();
        }
        return sb.toString().trim();
    }
}