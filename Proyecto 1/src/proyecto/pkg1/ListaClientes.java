/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaClientes que servirá
 * para el manejo de los datos referentes a los clientes
 *
 *
 */
public class ListaClientes {

    //Campos de la clase
    private NodoCliente primero;
    private NodoCliente ultimo;
    private int tamano;

    /**
     *
     * Constructor de ListaClientes
     *
     */
    public ListaClientes() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    //Cierre del constructor
    /**
     *
     * Método que devuelve si la lista es vacia o no
     *
     * @return true si está vacía, si no false
     *
     */
    public boolean esVacio() {
        return getPrimero() == null;
    }

    /**
     *
     * Procedimiento para agregar elementos a lista
     *
     * @param direccion direccion del cliente
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param cedula cedula del cliente
     */
    public void agregarFinal(char direccion, String nombre, String apellido, int cedula) {
        NodoCliente nuevo = new NodoCliente(direccion, nombre, apellido, cedula);
        if (esVacio()) {
            setPrimero(nuevo);
            setUltimo(nuevo);
        } else {
            getUltimo().setSiguiente(nuevo);
            setUltimo(nuevo);
        }
        setTamano(getTamano() + 1);
    }

    /**
     *
     * Método que te devuelve la información de los campos de la lista separados
     * con coma
     *
     * @return informacion de los campos de la lista
     *
     */
    public String getInformacionLista() {
        String info = "Clientes\n";
        if (!esVacio()) {

            NodoCliente aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getDireccion() + "," + aux.getNombre() + "," + aux.getApellido() + "," + aux.getCedula() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return info;
    }

    /**
     *
     * Método que te devuelve una lista con las cedulas de los clientes
     *
     * @return lista con las cedulas de los clientes
     *
     */
    public int[] getArrayClientes() {
        int[] clientes = new int[getTamano()];
        NodoCliente aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            clientes[i] = aux.getCedula();
            aux = aux.getSiguiente();
        }
        return clientes;
    }

    /**
     *
     * Método que te devuelve el NodoCliente correspodiente a la cedula
     *
     * @param cedula cedula a buscar
     * @return NodoCliente correspodiente a la cedula
     *
     */
    public NodoCliente getNodo(int cedula) {
        NodoCliente aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getCedula() == cedula) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    /**
     * Método que devuelve una lista de caracteres con las direcciones de los
     * clientes
     *
     * @return lista de caracteres con las direcciones de los clientes
     */
    public char[] getDireccionesClientes() {
        char[] direcciones = new char[getTamano()];
        NodoCliente aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            direcciones[i] = aux.getDireccion();
            aux = aux.getSiguiente();
        }
        return direcciones;
    }

    /**
     * Método que devuelve un booleano dependiendo de si existe la direccion que
     * se pase por parámetro
     *
     * @param direccion direccion del cliente
     *
     * @return booleano 
     */
    public boolean existeDireccion(String direccion) {
        NodoCliente aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getDireccion() == direccion.charAt(0)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    //Getters y setters
    public NodoCliente getPrimero() {
        return primero;
    }

    public void setPrimero(NodoCliente primero) {
        this.primero = primero;
    }

    public NodoCliente getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCliente ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
