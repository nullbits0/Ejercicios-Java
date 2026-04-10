/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.claseprogramcionbook.listacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-18
 */
public class ListaCircular {

    Nodo inicio;
    Nodo ultimo;

    ListaCircular() {
        inicio = null;
        ultimo = null;
    }

    public void crearLista(int valor) {

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        nuevo.setEnlace(nuevo);
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            ultimo.setEnlace(inicio);
        }
    }

    public void mostrar() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia, llenela antes de usar esta opcion");
            return;
        }
        Nodo temporal = inicio;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            do{
                if (inicio==ultimo) {
                   JOptionPane.showMessageDialog(null, "Valor: " + temporal.getValor()); 
                   break;
                }else{
                    JOptionPane.showMessageDialog(null, "Valor: " + temporal.getValor());
                    temporal = temporal.getEnlace();
                }
            }
            while (temporal != inicio) ;
        }
    }
    
    public void mostarExtremos(){
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia, llenela antes de usar esta opcion");
            return;
        }
        JOptionPane.showMessageDialog(null, "Primer Valor: " + inicio.getValor() + "; Segundo Valor: " + ultimo.getValor()); 
    }
    
    public void agregarFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        nuevo.setEnlace(nuevo);
        
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        }else{
            nuevo.setEnlace(inicio);
            ultimo.setEnlace(nuevo);
            ultimo = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Nodo Agregado");
    }
    
    public void agregarEntreNodo(int valor){
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia, llenela antes de usar esta opcion");
            return;
        }
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        nuevo.setEnlace(null);
        
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿después de qué valor quiere insertar?"));
        
        Nodo temporal = inicio;
        do {
            if (temporal.getValor() == posicion) {
                nuevo.setEnlace(temporal.getEnlace());
                temporal.setEnlace(nuevo);
                break;
            }
            temporal = temporal.getEnlace();
        } while (temporal != inicio);
        
        if (nuevo.getEnlace() == null) {
            JOptionPane.showMessageDialog(null, "Valor no encontrado, Ingrese un valor existente");
        }else JOptionPane.showMessageDialog(null, "Nodo Agregado");
    }
}
