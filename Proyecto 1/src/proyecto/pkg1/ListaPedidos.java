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

    public void agregarFinal(char direccion, char destino, String[] pedidos) {
        NodoPedido nuevo = new NodoPedido(direccion, destino, pedidos);
        if (esVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamano++;
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
