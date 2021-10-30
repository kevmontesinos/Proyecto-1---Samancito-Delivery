/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * @author Kevin
 */
public class NodoCliente {
    private NodoCliente siguiente;
    private char direccion;
    private String nombre;
    private String apellido;
    private int cedula;
    
    public NodoCliente(char direccion, String nombre, String apellido, int cedula){
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.siguiente = null;
        
        
    }
    
    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
