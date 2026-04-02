/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/*2. Información de la reserva de la habitación: nombre del huésped, número de días reservados, 
tarifa diaria (todas las habitaciones tienen la misma tarifa), si la habitación tiene vista al mar y número de habitaciones.
 */
public class Reserva {
    public String nombreHuesped;
    public int diasReservados;
    public double tarifaDiaria;
    public boolean vistaMar;
    public int numeroHabitaciones;

    public Reserva(String nombreHuesped, int diasReservados, double tarifaDiaria, boolean vistaMar, int numeroHabitaciones) {
        this.nombreHuesped = nombreHuesped;
        this.diasReservados = diasReservados;
        this.tarifaDiaria = tarifaDiaria;
        this.vistaMar = vistaMar;
        this.numeroHabitaciones = numeroHabitaciones;
    }
    
    
}
