/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.vistas;

import com.mycompany.hotel.objetos.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que maneja la interacción con el usuario relacionada con empleados en el hotel.
 * Permite imprimir mensajes y mostrar información sobre los empleados.
 * @author Jorge
 */
public class VistaEmpleado {

    /**
     * Método para imprimir un mensaje y solicitar información para registrar un nuevo empleado.
     * @param empleados La lista de empleados.
     */
    public void imprimirRegistrarEmpleado(ArrayList<Empleado> empleados) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id del nuevo empleado: ");
        int idEmpleado = sca.nextInt();
        Empleado empleado = new Empleado(idEmpleado);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        String nombre = sca.nextLine();
        empleado.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        String apellidos = sca.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        String DNI = sca.nextLine();
        empleado.setDNI(DNI);
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        int numeroTelefono = sca.nextInt();
        empleado.setNumeroTelefono(numeroTelefono);
        empleados.add(empleado);
    }

    /**
     * Método para imprimir un mensaje y eliminar un empleado de la lista de empleados.
     * @param empleados La lista de empleados.
     */
    public void imprimirEliminarEmpleado(ArrayList<Empleado> empleados) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id del empleado a dar de baja: ");
        int idCliente = sca.nextInt();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para dar de baja...");
        } else {
            Empleado empleado = null;
            for (Empleado clienteABorrar : empleados) {
                if (clienteABorrar.getIdEmpleado() == idCliente) {
                    empleado = clienteABorrar;
                }
            }
            empleados.remove(empleado);
            System.out.println("Empleado eliminado correctamente");
        }
    }

    /**
     * Método para imprimir información sobre los empleados.
     * @param empleados La lista de empleados.
     */
    public void imprimirListarEmpleados(ArrayList<Empleado> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar...");
        } else {
            for (Empleado empleadoAMostrar : empleados) {
                System.out.println("ID: " + empleadoAMostrar.getIdEmpleado());
                System.out.println("Nombre: " + empleadoAMostrar.getNombre());
                System.out.println("Apellidos: " + empleadoAMostrar.getApellidos());
                System.out.println("DNI: " + empleadoAMostrar.getDNI());
                System.out.println("Número de teléfono: " + empleadoAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
    }
}
