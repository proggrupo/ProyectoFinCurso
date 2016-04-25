/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alejandroo
 */
public class Cliente {
    private String DNI;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String direccion;
    private String email;

    /**
     *Obtiene el valor del atributo DNI del cliente
     * @return DNICliente
     */
    public String getDNI() {
        return DNI;
    }

    /**
     *Modifica el valor del atributo DNI del cliente
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *Obtiene el valor del atributo nombre del cliente
     * @return nombreCliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Modifica el valor del atributo nombre del cliente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Obtiene el valor del atributo apellidos del cliente
     * @return apellidosCliente
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *Modifica el valor del atributo apellidos del cliente
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *Obtiene el valor del atributo telefono del cliente
     * @return telefonoCliente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *Modifica el valor del atributo telefono del cliente
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *Obtiene el valor del atributo direccion del cliente
     * @return direccionCliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *Modifica el valor del atributo direccion del cliente
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *Obtiene el valor del atributo email del cliente
     * @return emailCliente
     */
    public String getEmail() {
        return email;
    }

    /**
     *Modifica el valor del atributo email del cliente
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
