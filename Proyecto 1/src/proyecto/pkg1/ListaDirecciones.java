/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaDirecciones que
 * servirá para guardar todas las direcciones indiferentemente si sean de
 * clientes o restaurantes. Utilizada frecuentemente para la elaboracion de las
 * matrices de adyacencia
 *
 *
 *
 */
public class ListaDirecciones {

    //Campos de la clase
    private NodoDireccion primero;
    private NodoDireccion ultimo;
    private int tamano;

    /**
     *
     * Constructor de ListaClientes
     *
     */
    public ListaDirecciones() {
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
     * Método que devuelve el tamaño de la lista
     *
     * @return tamano, el numero de direcciones
     *
     */
    public int getTamano() {
        return tamano;
    }

    /**
     *
     * Procedimiento para agregar elementos a lista
     *
     * @param elemento direccion *
     */
    public void agregarFinal(String elemento) {
        NodoDireccion nuevo = new NodoDireccion(elemento);
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
     * Método que te devuelve la posición de la direccion en la lista
     *
     * @param valor letra correspodiente a la direccion que se quiere hallar la
     * posicion
     * @return posición de la direccion en la lista
     *
     */
    public int getPosicionInt(String valor) {
        if (!esVacio()) {
            NodoDireccion aux = getPrimero();
            int cont = 0; //si se cuenta como el primer elemento el numero 1

            while (aux != null) {

                if (aux.getElemento().equals(valor)) {
                    return cont;
                }
                cont++;
                aux = aux.getSiguiente();
            }
            return 0;
        } else {
            return 0;
        }
    }

    /**
     *
     * Método que te devuelve la letra correspodiente a la dirección a partir de
     * la posicion que se encuentre en la lista
     *
     * @param posicion posicion dentro de la lista 
     * @return letra correspodiente a la posicion dentro de la lista
     *
     */
    public String getValor(int posicion) {

        if (!esVacio()) {
            NodoDireccion aux = getPrimero();

            for (int i = 0; i <= getTamano(); i++) {
                if (i == posicion) {
                    return aux.getElemento();
                }
                aux = aux.getSiguiente();
            }

        } else {
            return "";
        }
        return "";
    }

    //Getters y setters
    public NodoDireccion getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDireccion primero) {
        this.primero = primero;
    }

    public NodoDireccion getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDireccion ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
