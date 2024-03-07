package com.mycompany.hotel.objetos;

/**
 * Clase que representa una habitación en el hotel.
 * Contiene información como el identificador, tipo, número de camas y coste por día de la habitación.
 * Permite acceder y modificar esta información a través de sus métodos getter y setter.
 * @author Jorge
 */
public class Habitacion {

    // Atributos de la clase Habitacion
    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    /**
     * Constructor de la clase Habitacion.
     * @param idHabitacion El identificador de la habitación.
     */
    public Habitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * Método getter para obtener el identificador de la habitación.
     * @return El identificador de la habitación.
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * Método setter para establecer el identificador de la habitación.
     * @param idHabitacion El identificador de la habitación a establecer.
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * Método getter para obtener el tipo de la habitación.
     * @return El tipo de la habitación.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método setter para establecer el tipo de la habitación.
     * @param tipo El tipo de la habitación a establecer.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método getter para obtener el número de camas de la habitación.
     * @return El número de camas de la habitación.
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * Método setter para establecer el número de camas de la habitación.
     * @param numeroCamas El número de camas de la habitación a establecer.
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * Método getter para obtener el coste por día de la habitación.
     * @return El coste por día de la habitación.
     */
    public double getCostePorDia() {
        return costePorDia;
    }

    /**
     * Método setter para establecer el coste por día de la habitación.
     * @param costePorDia El coste por día de la habitación a establecer.
     */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }

}
