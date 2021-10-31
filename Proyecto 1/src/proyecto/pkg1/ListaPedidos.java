/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class ListaPedidos {

    NodoPedido primero;
    NodoPedido ultimo;
    int tamano;

    public ListaPedidos() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    public boolean esVacio() {
        return primero == null;
    }

    public void agregarFinal(char direccionCliente, char direccionRestaurante, String[] pedido) {
        NodoPedido nuevo = new NodoPedido(direccionCliente, direccionRestaurante, pedido);
        if (esVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamano++;
    }

    public String getPedidos(NodoPedido nodo) {
        String info = "";
        for (int i = 0; i < nodo.getPedido().length; i++) {
            info += nodo.getPedido()[i];
            if (i < nodo.getPedido().length - 1) {
                info += "/";
            }
        }

        return info;
    }
    
   
    
    public String[] getListaPedidos(){
        String[] pedidos = new String[tamano];
        NodoPedido aux = primero;
        for (int i = 0; i < tamano; i++){
            pedidos[i] = getPedidos(aux);
            aux = aux.getSiguiente();
        }
        return pedidos;
    }

    public String getInformacionLista() {
        String info = "Pedidos\n";
        if (!esVacio()) {

            NodoPedido aux = primero;

            for (int i = 0; i < tamano; i++) {
                info += aux.getDireccionCliente() + "," + aux.getDireccionRestaurante() + "," + getPedidos(aux) + "\n";
                aux = aux.getSiguiente();
            }
        }
        return info;
    }

    public void imprimirLista() {
        String info = "";
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoPedido aux = primero;

            for (int i = 0; i < tamano; i++) {
                info += "Direccion cliente: " + aux.getDireccionCliente() + ", " + "Direccion Rest : " + aux.getDireccionRestaurante() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

}
