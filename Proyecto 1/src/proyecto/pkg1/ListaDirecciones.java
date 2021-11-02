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

    private NodoDireccion primero;
    private NodoDireccion ultimo;
    private int tamano;

    public ListaDirecciones() {
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
    
    public int getTamano(){
        return tamano;
    }

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

    public void imprimirLista() {
        if (esVacio()) {
            System.out.println("La lista está vacía");

        } else {
            NodoDireccion aux = getPrimero();
            for (int i = 0; i < getTamano(); i++) {
                System.out.print(aux.getElemento() + " ");
                aux = aux.getSiguiente();
            }
        }
        System.out.println("");
    }

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


