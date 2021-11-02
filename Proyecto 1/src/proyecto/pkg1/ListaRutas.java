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

    private NodoRuta primero;
    private NodoRuta ultimo;
    private int tamano;

    public ListaRutas() {
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

    public void agregarFinal(char origen, char destino, int peso) {
        NodoRuta nuevo = new NodoRuta(origen, destino, peso);
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
        String info = "Rutas\n";
        if (!esVacio()) {

            NodoRuta aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getOrigen() + "," + aux.getDestino() + "," + aux.getPeso() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return info;
    }

    public String getRutasGraphviz() {
        NodoRuta aux = getPrimero();
        String info = "";
        for (int i = 0; i < getTamano(); i++) {
            info += aux.getOrigen() + " -> " + aux.getDestino() + " " + "[label=\"" + aux.getPeso() + "\"];" + "\n";
            aux = aux.getSiguiente();
        }
        return info;
    }

    public boolean existeRuta(String origen, String destino) {
       
        NodoRuta aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if ((aux.getOrigen() == origen.charAt(0)) && aux.getDestino() == destino.charAt(0)){
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    public String[] getArrayRutas(){
        NodoRuta aux = getPrimero();
        String[] rutas = new String[getTamano()];
        for (int i=0; i < getTamano(); i++){
            rutas[i] = aux.getOrigen() + "," + aux.getDestino() + "," + aux.getPeso();
            aux = aux.getSiguiente();
        }
        return rutas;
    }
    public void imprimirLista() {
        String info = "";
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoRuta aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += "Origen: " + aux.getOrigen() + ", " + "Destino: " + aux.getDestino() + ", " + "Peso: " + aux.getPeso() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

    public NodoRuta getPrimero() {
        return primero;
    }

    public void setPrimero(NodoRuta primero) {
        this.primero = primero;
    }

    public NodoRuta getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoRuta ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
