/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * @author Kevin
 */
public class ListaDirecciones {

    NodoDireccion primero;
    NodoDireccion ultimo;
    int tamano;

    public ListaDirecciones() {
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
    
    public int getTamano(){
        return tamano;
    }

    public void agregarFinal(String elemento) {
        NodoDireccion nuevo = new NodoDireccion(elemento);
        if (esVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamano++;
    }

    public int getPosicionInt(String valor) {
        if (!esVacio()) {
            NodoDireccion aux = primero;
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

    public String getValor(int posicion) {

        if (!esVacio()) {
            NodoDireccion aux = primero;

            for (int i = 0; i <= tamano; i++) {
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

    public void imprimirLista() {
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoDireccion aux = primero;
            for (int i = 0; i < tamano; i++) {
                System.out.print(aux.getElemento() + " ");
                aux = aux.getSiguiente();
            }
        }
        System.out.println("");
    }

}


