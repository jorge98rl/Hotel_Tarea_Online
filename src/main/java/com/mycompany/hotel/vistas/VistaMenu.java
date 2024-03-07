/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.vistas;

import java.util.Scanner;

/**
 * Clase que maneja la interacción con el usuario mediante menús en el hotel.
 * Permite imprimir menús y mensajes relacionados con las opciones del menú.
 * @author Jorge
 */
public class VistaMenu {

    /**
     * Método para imprimir el menú principal del programa.
     */
    public void imprimirMenu() {
        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar empleado.");
        System.out.println("4. Dar de baja a un empleado.");
        System.out.println("5. Agregar nueva habitación.");
        System.out.println("6. Eliminar una habitación.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los empleados.");
        System.out.println("9. Mostrar todas las habitaciones.");
        System.out.println("10. Salir del programa.");
        System.out.println("Introduce el número de la opción deseada: ");
    }

    /**
     * Método para imprimir un mensaje al salir del programa.
     */
    public void imprimirSalirDelPrograma() {
        System.out.println("Cerrando el programa...");
    }

    /**
     * Método para imprimir un mensaje cuando la opción seleccionada no existe.
     */
    public void imprimirOpcionNoExiste() {
        System.out.println("La opción seleccionada no existe...");
    }
    
    /**
     * Método estático para seleccionar una opción del menú.
     * @return La opción seleccionada.
     */
    public static int seleccionarOpcion() {
        Scanner sca = new Scanner(System.in);
        return sca.nextInt();
    }
}
