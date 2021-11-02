/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaRutas que servirá
 * para el manejo de los datos referentes a las rutas
 *
 *
 */
public class ListaRutas {

    //Campos de la clase
    private NodoRuta primero;
    private NodoRuta ultimo;
    private int tamano;

    /**
     *
     * Constructor de ListaClientes
     *
     */
    public ListaRutas() {
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
     * @param origen direccion origen
     * @param destino direccion destino
     * @param peso distancia desde origen hasta destino
     */
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

    /**
     *
     * Método que te devuelve la información de los campos de la lista separados
     * con coma
     *
     * @return informacion de los campos de la lista
     *
     */
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

    /**
     *
     * Método que te devuelve un string con la ruta del nodo con el formato apto
     * para usar Graphviz
     *
     * @return string con la ruta del nodo con el formato apto para usar
     * Graphviz
     *
     */
    public String getRutasGraphviz() {
        NodoRuta aux = getPrimero();
        String info = "";
        for (int i = 0; i < getTamano(); i++) {
            info += aux.getOrigen() + " -> " + aux.getDestino() + " " + "[label=\"" + aux.getPeso() + "\"];" + "\n";
            aux = aux.getSiguiente();
        }
        return info;
    }

    /**
     * Método que devuelve un booleano dependiendo de las direcciones que se
     * pasen por parametro
     *
     * @param origen direccion de origen
     * @param destino direccion de destino
     *
     * @return booleano
     */
    public boolean existeRuta(String origen, String destino) {

        NodoRuta aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if ((aux.getOrigen() == origen.charAt(0)) && aux.getDestino() == destino.charAt(0)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    /**
     *
     * Método que te devuelve una lista con las rutas
     *
     * @return lista con las rutas
     *
     */
    public String[] getArrayRutas() {
        NodoRuta aux = getPrimero();
        String[] rutas = new String[getTamano()];
        for (int i = 0; i < getTamano(); i++) {
            rutas[i] = aux.getOrigen() + "," + aux.getDestino() + "," + aux.getPeso();
            aux = aux.getSiguiente();
        }
        return rutas;
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
