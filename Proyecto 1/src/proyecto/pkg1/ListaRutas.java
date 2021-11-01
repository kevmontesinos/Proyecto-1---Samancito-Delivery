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
public class ListaRutas {

    NodoRuta primero;
    NodoRuta ultimo;
    int tamano;

    public ListaRutas() {
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

    public void agregarFinal(char origen, char destino, int peso) {
        NodoRuta nuevo = new NodoRuta(origen, destino, peso);
        if (esVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamano++;
    }

    public String getInformacionLista() {
        String info = "Rutas\n";
        if (!esVacio()) {

            NodoRuta aux = primero;

            for (int i = 0; i < tamano; i++) {
                info += aux.getOrigen()+ "," + aux.getDestino()+ "," + aux.getPeso()+ "\n";
                aux = aux.getSiguiente();
            }
        }
        return info;
    }
 
    public String getRutasGraphviz(){
        NodoRuta aux = primero;
        String info = "";
        for (int i = 0; i < tamano; i++){
            info += aux.getOrigen()+ " -> " + aux.getDestino()+ " " + "[label=\"" + aux.getPeso() + "\"];" + "\n";
                aux = aux.getSiguiente();
        }
        return info;
    }
    
    public void imprimirLista() {
        String info = "";
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoRuta aux = primero;

            for (int i = 0; i < tamano; i++) {
                info += "Origen: " + aux.getOrigen() + ", " + "Destino: " + aux.getDestino() + ", " + "Peso: " + aux.getPeso() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

}
