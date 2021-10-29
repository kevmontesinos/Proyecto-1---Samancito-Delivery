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

    NodoCliente primero;
    NodoCliente ultimo;
    int tamano;

    public ListaClientes() {
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

    public void agregarFinal(char direccion, String nombre, String apellido, int cedula) {
        NodoCliente nuevo = new NodoCliente(direccion, nombre, apellido, cedula);
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
            NodoCliente aux = primero;
            
            for (int i = 0; i < tamano; i++) {
                info += "Direccion: " + aux.getDireccion() + ", " + "Nombre: " + aux.getNombre() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }
 
}
