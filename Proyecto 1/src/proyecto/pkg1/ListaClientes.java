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
public class ListaClientes {

    private NodoCliente primero;
    private NodoCliente ultimo;
    private int tamano;

    public ListaClientes() {
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

    public int[] getArrayClientes() {
        int[] clientes = new int[getTamano()];
        NodoCliente aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            clientes[i] = aux.getCedula();
            aux = aux.getSiguiente();
        }
        return clientes;
    }

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

    public char[] getDireccionesClientes() {
        char[] direcciones = new char[getTamano()];
        NodoCliente aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            direcciones[i] = aux.getDireccion();
            aux = aux.getSiguiente();
        }
        return direcciones;
    }

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

    public void imprimirLista() {
        String info = "";
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoCliente aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += "Direccion: " + aux.getDireccion() + ", " + "Nombre: " + aux.getNombre() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

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
