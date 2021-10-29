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
public class ListaRestaurantes {

    NodoRestaurante primero;
    NodoRestaurante ultimo;
    int tamano;

    public ListaRestaurantes() {
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

    public void agregarFinal(char direccion, String nombre, String[] menu) {
        NodoRestaurante nuevo = new NodoRestaurante(direccion, nombre, menu);
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
            NodoRestaurante aux = primero;
            
            for (int i = 0; i < tamano; i++) {
                info += "Direccion: " + aux.getDireccion() + ", " + "Nombre: " + aux.getNombre() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

}
