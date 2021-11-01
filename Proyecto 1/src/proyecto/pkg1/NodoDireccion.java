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
public class NodoDireccion {

    private NodoDireccion siguiente;
    private String elemento;

    public NodoDireccion(String elemento) {
        this.siguiente = null;
        this.elemento = elemento;
    }

    public NodoDireccion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDireccion siguiente) {
        this.siguiente = siguiente;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

}
