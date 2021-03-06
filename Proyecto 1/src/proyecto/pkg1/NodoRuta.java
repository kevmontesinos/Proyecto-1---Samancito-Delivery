/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * Esta clase es utilizada para crear el NodoRuta, usado posteriormente para la
 * NodoRuta
 *
 */
public class NodoRuta {

    //Campos de la clase
    private NodoRuta siguiente;
    private char origen;
    private char destino;
    private int peso;

    /**
     *
     * Constructor de NodoRuta
     *
     */
    public NodoRuta(char origen, char destino, int peso) {
        this.siguiente = null;
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    //Getters y setters
    public char getOrigen() {
        return origen;
    }

    public void setOrigen(char origen) {
        this.origen = origen;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public NodoRuta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRuta siguiente) {
        this.siguiente = siguiente;
    }

}
