package com.mycompany.hotel.objetos;

/**
 * Clase que representa a un cliente del hotel.
 * Contiene información como el identificador, nombre, apellidos, DNI y número de teléfono del cliente.
 * Permite acceder y modificar esta información a través de sus métodos getter y setter.
 * @author Jorge
 */
public class Cliente {

    // Atributos de la clase Cliente
    private int idCliente;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

     /**
     * Constructor de la clase Cliente.
     * @param idCliente El identificador del cliente.
     */
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

     /**
     * Método getter para obtener el identificador del cliente.
     * @return El identificador del cliente.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Método setter para establecer el identificador del cliente.
     * @param idCliente El identificador del cliente a establecer.
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Método getter para obtener el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del cliente.
     * @param nombre El nombre del cliente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Método getter para obtener los apellidos del cliente.
     * @return Los apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método setter para establecer los apellidos del cliente.
     * @param apellidos Los apellidos del cliente a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

     /**
     * Método getter para obtener el DNI del cliente.
     * @return El DNI del cliente.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Método setter para establecer el DNI del cliente.
     * @param DNI El DNI del cliente a establecer.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

     /**
     * Método getter para obtener el número de teléfono del cliente.
     * @return El número de teléfono del cliente.
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

     /**
     * Método setter para establecer el número de teléfono del cliente.
     * @param numeroTelefono El número de teléfono del cliente a establecer.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

}
