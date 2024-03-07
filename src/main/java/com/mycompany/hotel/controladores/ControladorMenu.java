/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.controladores;

import com.mycompany.hotel.vistas.VistaMenu;

/**
 * Clase que controla el menú de operaciones del sistema hotelero.
 * Permite interactuar con las funcionalidades de clientes, empleados y habitaciones.
 * @author Jorge
 */
public class ControladorMenu {

    // Instancias de otros controladores y la vista del menú
    ControladorCliente controladorCliente = new ControladorCliente();
    ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
    ControladorHabitacion controladorHabitacion = new ControladorHabitacion();
    VistaMenu vistaMenu = new VistaMenu();

    // Constantes que representan las opciones del menú
    public static final int REGISTRAR_CLIENTE = 1;
    public static final int ELIMINAR_CLIENTE = 2;
    public static final int REGISTRAR_EMPLEADO = 3;
    public static final int ELIMINAR_EMPLEADO = 4;
    public static final int REGISTRAR_HABITACION = 5;
    public static final int ELIMINAR_HABITACION = 6;
    public static final int LISTAR_CLIENTES = 7;
    public static final int LISTAR_EMPLEADOS = 8;
    public static final int LISTAR_HABITACIONES = 9;
    public static final int SALIR = 10;

    // Variable que guarda la opción seleccionada por el usuario
    int opcion = SALIR;

    /**
     * Método que muestra el menú y ejecuta la opción seleccionada por el usuario.
     */
    public void menu() {

        do {
            ejecutarMenu();
        } while (opcion != SALIR);
    }

    /**
     * Método que ejecuta la opción seleccionada por el usuario.
     */
    
    public void ejecutarMenu() {

        vistaMenu.imprimirMenu();
        opcion = vistaMenu.seleccionarOpcion();

        switch (opcion) {
            case REGISTRAR_CLIENTE:
                controladorCliente.crearNuevoCliente();
                break;
            case ELIMINAR_CLIENTE:
                controladorCliente.eliminarCliente();
                break;
            case REGISTRAR_EMPLEADO:
                controladorEmpleado.registrarEmpleado();
                break;
            case ELIMINAR_EMPLEADO:
                controladorEmpleado.eliminarEmpleado();
                break;
            case REGISTRAR_HABITACION:
                controladorHabitacion.registrarHabitacion();
                break;
            case ELIMINAR_HABITACION:
                controladorHabitacion.eliminarHabitacion();
                break;
            case LISTAR_CLIENTES:
                controladorCliente.listarClientes();
                break;
            case LISTAR_EMPLEADOS:
                controladorEmpleado.listarEmpleados();
                break;
            case LISTAR_HABITACIONES:
                controladorHabitacion.listarHabitaciones();
                break;
            case SALIR:
                vistaMenu.imprimirSalirDelPrograma();
                break;
            default:
                vistaMenu.imprimirOpcionNoExiste();
        }
    }

}
