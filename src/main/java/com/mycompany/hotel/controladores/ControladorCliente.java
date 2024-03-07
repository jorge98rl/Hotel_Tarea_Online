/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.controladores;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.vistas.VistaCliente;
import java.util.ArrayList;

/**
 * Controlador para manejar las operaciones relacionadas con los clientes del hotel.
 * Permite crear nuevos clientes, eliminar clientes existentes y listar todos los clientes.
 * @author Jorge
 */
public class ControladorCliente {
    
    // Lista que almacena los clientes
    private ArrayList<Cliente> clientes;
    
     /**
     * Constructor de la clase ControladorCliente.
     * Inicializa la lista de clientes.
     */
    public ControladorCliente() {
        this.clientes = new ArrayList<>();
    }
    
    /**
     * Método para obtener la lista de clientes.
     * @return La lista de clientes.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
     /**
     * Método para establecer la lista de clientes.
     * @param clientes La lista de clientes a establecer.
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
     /**
     * Método para crear un nuevo cliente.
     * Muestra la vista correspondiente para recopilar la información del cliente y lo añade a la lista.
     */
    public void crearNuevoCliente() {
        VistaCliente vistaCliente = new VistaCliente();
        
        // Solicitar información del cliente
        int idCliente = vistaCliente.solicitarIdCliente();
        String nombre = vistaCliente.solicitarNombre();
        String apellidos = vistaCliente.solicitarApellidos();
        String dni = vistaCliente.solicitarDni();
        int telefono = vistaCliente.solicitarTelefono();
        
        // Crear y añadir el cliente a la lista
        Cliente cliente = new Cliente(idCliente);
        cliente.setNombre(nombre);
        cliente.setApellidos(apellidos);
        cliente.setDNI(dni);
        cliente.setNumeroTelefono(telefono);
        clientes.add(cliente);
        
        // Mostrar mensaje de confirmación
        vistaCliente.imprimirClienteAñadido();
    }
    
    /**
     * Método para eliminar un cliente existente.
     * Muestra la vista correspondiente para seleccionar el cliente a eliminar.
     */
    public void eliminarCliente() {
        VistaCliente vistaCliente = new VistaCliente();
        vistaCliente.imprimirEliminarClientes(clientes);
    }
    
    /**
     * Método para listar todos los clientes registrados.
     * Muestra la vista correspondiente para mostrar la lista de clientes.
     */
    public void listarClientes() {
        VistaCliente vistaCliente = new VistaCliente();
        vistaCliente.imprimirListarClientes(clientes);
    }
}
