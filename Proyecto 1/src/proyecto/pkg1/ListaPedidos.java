/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaPedidos que servirá
 * para el manejo de los datos referentes a los pedidos
 *
 *
 */
public class ListaPedidos {

    //Campos de la clase
    private NodoPedido primero;
    private NodoPedido ultimo;
    private int tamano;

    /**
     *
     * Constructor de ListaClientes
     *
     */
    public ListaPedidos() {
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
     * @param direccionCliente direccion del cliente
     * @param direccionRestaurante direccion del restaurante
     * @param pepido pedido realizado por el cliente
     */
    public void agregarFinal(char direccionCliente, char direccionRestaurante, String pedido) {
        NodoPedido nuevo = new NodoPedido(direccionCliente, direccionRestaurante, pedido);
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
     * Método que te devuelve una lista con los pedidos pendientes
     *
     * @return lista con los pedidos pendientes
     *
     */
    public String[] getArrayPedidos() {
        String[] pedidos = new String[getTamano()];
        NodoPedido aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            pedidos[i] = aux.getDireccionRestaurante() + " ==> " + aux.getDireccionCliente() + "  " + aux.getPedido();
            aux = aux.getSiguiente();
        }
        return pedidos;
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
        String info = "Pedidos\n";
        if (!esVacio()) {

            NodoPedido aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getDireccionCliente() + "," + aux.getDireccionRestaurante() + "," + aux.getPedido() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return info;
    }
    
    //Getters y setters
    public NodoPedido getPrimero() {
        return primero;
    }

    public void setPrimero(NodoPedido primero) {
        this.primero = primero;
    }

    public NodoPedido getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoPedido ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
