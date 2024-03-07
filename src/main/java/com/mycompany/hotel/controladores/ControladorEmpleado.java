/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.controladores;

import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.vistas.VistaEmpleado;
import java.util.ArrayList;

/**
 * Controlador para manejar las operaciones relacionadas con los empleados del hotel
 * Permite registrar, eliminar y listar empleados
 * @author Jorge
 */
public class ControladorEmpleado {
    
    // Lista que almacena los empleados
    private ArrayList<Empleado> empleados;    
    
     /**
     * Constructor de la clase ControladorEmpleado.
     * Inicializa la lista de empleados.
     */
    public ControladorEmpleado() {
        this.empleados = new ArrayList<>();
    }
    
     /**
     * Método para obtener la lista de empleados.
     * @return La lista de empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
     /**
     * Método para establecer la lista de empleados.
     * @param empleados La lista de empleados a establecer.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
     /**
     * Método para registrar un nuevo empleado.
     * Muestra la vista correspondiente para realizar el registro.
     */
    public void registrarEmpleado() {
        VistaEmpleado vistaEmpleado = new VistaEmpleado();
        vistaEmpleado.imprimirRegistrarEmpleado(empleados);
    }
    
    /**
     * Método para eliminar un empleado existente.
     * Muestra la vista correspondiente para realizar la eliminación.
     */
    public void eliminarEmpleado() {
        VistaEmpleado vistaEmpleado = new VistaEmpleado();
        vistaEmpleado.imprimirEliminarEmpleado(empleados);
    }
    
     /**
     * Método para listar todos los empleados registrados.
     * Muestra la vista correspondiente para mostrar la lista de empleados.
     */
    public void listarEmpleados() {
        VistaEmpleado vistaEmpleado = new VistaEmpleado();
        vistaEmpleado.imprimirListarEmpleados(empleados);
    }
}
