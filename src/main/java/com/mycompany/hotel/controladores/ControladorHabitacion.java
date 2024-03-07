/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.controladores;

import com.mycompany.hotel.objetos.Habitacion;
import com.mycompany.hotel.vistas.VistaHabitacion;
import java.util.ArrayList;

/**
 * Controlador para manejar las operaciones relacionadas con las habitaciones del hotel.
 * Permite registrar, eliminar y listar habitaciones.
 * @author Jorge
 */
public class ControladorHabitacion {
    
    // Lista que almacena las habitaciones
    private ArrayList<Habitacion> habitaciones;    
    
     /**
     * Constructor de la clase ControladorHabitacion.
     * Inicializa la lista de habitaciones.
     */
    public ControladorHabitacion() {
        this.habitaciones = new ArrayList<>();
    }
    
    /**
     * Método para obtener la lista de habitaciones.
     * @return La lista de habitaciones.
     */
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
     /**
     * Método para establecer la lista de habitaciones.
     * @param habitaciones La lista de habitaciones a establecer.
     */
    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
     /**
     * Método para registrar una nueva habitación.
     * Muestra la vista correspondiente para realizar el registro.
     */
    public void registrarHabitacion() {
        VistaHabitacion vistaHabitacion = new VistaHabitacion();
        vistaHabitacion.imprimirRegistrarHabitacion(habitaciones);
    }
    
     /**
     * Método para eliminar una habitación existente.
     * Muestra la vista correspondiente para realizar la eliminación.
     */
    public void eliminarHabitacion() {
        VistaHabitacion vistaHabitacion = new VistaHabitacion();
        vistaHabitacion.imprimirEliminarHabitacion(habitaciones);
    }
    
    /**
     * Método para listar todas las habitaciones registradas.
     * Muestra la vista correspondiente para mostrar la lista de habitaciones.
     */
    public void listarHabitaciones() {
        VistaHabitacion vistaHabitacion = new VistaHabitacion();
        vistaHabitacion.imprimirListarHabitaciones(habitaciones);
    }
}
