package com.mycompany.hotel.objetos;

/**
 * Clase que representa a un empleado del hotel.
 * Contiene información como el identificador, nombre, apellidos, DNI y número de teléfono del empleado.
 * Permite acceder y modificar esta información a través de sus métodos getter y setter.
 * @author Jorge
 */
public class Empleado {

    // Atributos de la clase Empleado
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    /**
     * Constructor de la clase Empleado.
     * @param idEmpleado El identificador del empleado.
     */
    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Método getter para obtener el identificador del empleado.
     * @return El identificador del empleado.
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Método setter para establecer el identificador del empleado.
     * @param idEmpleado El identificador del empleado a establecer.
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Método getter para obtener el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del empleado.
     * @param nombre El nombre del empleado a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener los apellidos del empleado.
     * @return Los apellidos del empleado.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método setter para establecer los apellidos del empleado.
     * @param apellidos Los apellidos del empleado a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método getter para obtener el DNI del empleado.
     * @return El DNI del empleado.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Método setter para establecer el DNI del empleado.
     * @param DNI El DNI del empleado a establecer.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Método getter para obtener el número de teléfono del empleado.
     * @return El número de teléfono del empleado.
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Método setter para establecer el número de teléfono del empleado.
     * @param numeroTelefono El número de teléfono del empleado a establecer.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}

