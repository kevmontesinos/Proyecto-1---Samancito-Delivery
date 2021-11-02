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

    private NodoPedido primero;
    private NodoPedido ultimo;
    private int tamano;

    public ListaPedidos() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    public void vaciar() {
        this.setPrimero(null);
        this.setUltimo(null);
        this.setTamano(0);
    }

    public boolean esVacio() {
        return getPrimero() == null;
    }

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

//    public String getPedidos(NodoPedido nodo) {
//        String info = "";
//        for (int i = 0; i < nodo.getPedido().length; i++) {
//            info += nodo.getPedido()[i];
//            if (i < nodo.getPedido().length - 1) {
//                info += "/";
//            }
//        }
//
//        return info;
//    }
    public String[] getArrayPedidos() {
        String[] pedidos = new String[getTamano()];
        NodoPedido aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            pedidos[i] = aux.getDireccionRestaurante() + " ==> " + aux.getDireccionCliente()+ "  " + aux.getPedido();
            aux = aux.getSiguiente();
        }
        return pedidos;
    }

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

    public void imprimirLista() {
        String info = "";
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoPedido aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += "Direccion cliente: " + aux.getDireccionCliente() + ", " + "Direccion Rest : " + aux.getDireccionRestaurante() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

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
