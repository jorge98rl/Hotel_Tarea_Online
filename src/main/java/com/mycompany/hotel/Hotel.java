package com.mycompany.hotel;

import com.mycompany.hotel.controladores.ControladorMenu;
/**
 * Clase principal que sirve como punto de entrada para el programa del hotel.
 * 
 * @author Jorge
 */
public class Hotel {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos pasados al programa desde la línea de comandos.
     */
    public static void main(String[] args) {

        ControladorMenu controladorMenu = new ControladorMenu();
        controladorMenu.menu();
    }
}
