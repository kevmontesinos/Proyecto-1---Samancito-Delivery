/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * Esta clase es utilizada para crear el NodoCliente, usado posteriormente para
 * la ListaCliente
 *
 */
public class NodoDireccion {

    //Campos de la clase
    private NodoDireccion siguiente;
    private String elemento;

    /**
     *
     * Constructor de NodoCliente
     *
     */
    public NodoDireccion(String elemento) {
        this.siguiente = null;
        this.elemento = elemento;
    }

    //Getters y setters
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
