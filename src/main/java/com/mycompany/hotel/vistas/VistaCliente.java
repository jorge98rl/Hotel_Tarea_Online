/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.vistas;

import com.mycompany.hotel.objetos.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que maneja la interacción con el usuario relacionada con clientes en el hotel.
 * Permite solicitar información del cliente, imprimir mensajes y mostrar información sobre los clientes.
 * @author Jorge
 */
public class VistaCliente {

    /**
     * Método para solicitar al usuario el ID del nuevo cliente.
     * @return El ID del nuevo cliente.
     */
    public int solicitarIdCliente() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id del nuevo cliente: ");
        return sca.nextInt();
    }

    /**
     * Método para solicitar al usuario el nombre del nuevo cliente.
     * @return El nombre del nuevo cliente.
     */
    public String solicitarNombre() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        return sca.nextLine();
    }

    /**
     * Método para solicitar al usuario los apellidos del nuevo cliente.
     * @return Los apellidos del nuevo cliente.
     */
    public String solicitarApellidos() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca los apellidos del nuevo cliente");
        return sca.nextLine();
    }

    /**
     * Método para solicitar al usuario el DNI del nuevo cliente.
     * @return El DNI del nuevo cliente.
     */
    public String solicitarDni() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        return sca.nextLine();
    }

    /**
     * Método para solicitar al usuario el número de teléfono del nuevo cliente.
     * @return El número de teléfono del nuevo cliente.
     */
    public int solicitarTelefono() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        return sca.nextInt();
    }

    /**
     * Método para imprimir un mensaje de éxito al añadir un cliente.
     */
    public void imprimirClienteAñadido() {
        System.out.println("Cliente añadido con éxito.");
    }

    /**
     * Método para imprimir un mensaje y eliminar un cliente de la lista de clientes.
     * @param clientes La lista de clientes.
     */
    public void imprimirEliminarClientes(ArrayList<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        int idCliente = scanner.nextInt();
        Cliente cliente = null;
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            for (Cliente clienteABorrar : clientes) {
                if (clienteABorrar.getIdCliente() == idCliente) {
                    cliente = clienteABorrar;
                }
            }
            clientes.remove(cliente);
            System.out.println("Cliente borrado correctamente");
        }
    }

    /**
     * Método para imprimir información sobre los clientes.
     * @param clientes La lista de clientes.
     */
    public void imprimirListarClientes(ArrayList<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (Cliente clienteAMostrar : clientes) {
                System.out.println("ID: " + clienteAMostrar.getIdCliente());
                System.out.println("Nombre: " + clienteAMostrar.getNombre());
                System.out.println("Apellidos: " + clienteAMostrar.getApellidos());
                System.out.println("DNI: " + clienteAMostrar.getDNI());
                System.out.println("Número de teléfono: " + clienteAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
    }
}
