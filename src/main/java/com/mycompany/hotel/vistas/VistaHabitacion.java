/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.vistas;

import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que maneja la interacción con el usuario relacionada con habitaciones en el hotel.
 * Permite imprimir mensajes y mostrar información sobre las habitaciones.
 * @author Jorge
 */
public class VistaHabitacion {

    /**
     * Método para imprimir un mensaje y registrar una nueva habitación.
     * @param habitaciones La lista de habitaciones.
     */
    public void imprimirRegistrarHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id de la nueva habitación: ");
        int idHabitacion = sca.nextInt();
        Habitacion habitacion = new Habitacion(idHabitacion);
        sca.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        String tipo = sca.nextLine();
        habitacion.setTipo(tipo);
        System.out.println("Introduzca número de camas de la nueva habitación: ");
        int numeroCamas = sca.nextInt();
        habitacion.setNumeroCamas(numeroCamas);
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        double costePorDia = sca.nextDouble();
        habitacion.setCostePorDia(costePorDia);
        sca.nextLine();
        habitaciones.add(habitacion);
    }

    /**
     * Método para imprimir un mensaje y eliminar una habitación de la lista de habitaciones.
     * @param habitaciones La lista de habitaciones.
     */
    public void imprimirEliminarHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        int idHabitacion = sca.nextInt();
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para borrar...");
        } else {
            Habitacion habitacion = null;
            for (Habitacion habitacionABorrar : habitaciones) {
                if (habitacionABorrar.getIdHabitacion() == idHabitacion) {
                    habitacion = habitacionABorrar;
                }
            }
            habitaciones.remove(habitacion);
            System.out.println("Habitación eliminada con éxito");
        }
    }

    /**
     * Método para imprimir información sobre las habitaciones.
     * @param habitaciones La lista de habitaciones.
     */
    public void imprimirListarHabitaciones(ArrayList<Habitacion> habitaciones) {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {
            for (Habitacion habitacionAMostrar : habitaciones) {
                System.out.println("ID: " + habitacionAMostrar.getIdHabitacion());
                System.out.println("Tipo: " + habitacionAMostrar.getTipo());
                System.out.println("Número de camas: " + habitacionAMostrar.getNumeroCamas());
                System.out.println("Coste por día: " + habitacionAMostrar.getCostePorDia());
                System.out.println("");
            }
        }
    }
}
