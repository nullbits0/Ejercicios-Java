/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.editortexto;

/**
 *
 * @author UserJ
 */
public class Nodo {
    private String palabra;
    private Nodo adelante;
    private Nodo atras;

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the adelante
     */
    public Nodo getAdelante() {
        return adelante;
    }

    /**
     * @param adelante the adelante to set
     */
    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

    /**
     * @return the atras
     */
    public Nodo getAtras() {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
}
