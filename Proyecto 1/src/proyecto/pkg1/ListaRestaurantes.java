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

    private NodoRestaurante primero;
    private NodoRestaurante ultimo;
    private int tamano;

    public ListaRestaurantes() {
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

    public void agregarFinal(char direccion, String nombre, String[] menu) {
        NodoRestaurante nuevo = new NodoRestaurante(direccion, nombre, menu);
        if (esVacio()) {
            setPrimero(nuevo);
            setUltimo(nuevo);
        } else {
            getUltimo().setSiguiente(nuevo);
            setUltimo(nuevo);
        }
        setTamano(getTamano() + 1);
    }

    public String getMenu(NodoRestaurante nodo) {
        String info = "";
        for (int i = 0; i < nodo.getMenu().length; i++) {
            info += nodo.getMenu()[i];
            if (i < nodo.getMenu().length - 1) {
                info += "/";
            }
        }

        return info;
    }

    public String getInformacionLista() {
        String info = "Restaurantes\n";
        if (!esVacio()) {

            NodoRestaurante aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getDireccion() + "," + aux.getNombre() + "," + getMenu(aux) + "\n";
                aux = aux.getSiguiente();
            }
        }
        return info;
    }

    public String[] getArrayRest() {
        String[] restaurantes = new String[getTamano()];
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            restaurantes[i] = aux.getNombre();
            aux = aux.getSiguiente();
        }
        return restaurantes;
    }

    public String[] buscarRest(String restaurante) {
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getNombre().equals(restaurante)) {
                return aux.getMenu();
            }
            aux = aux.getSiguiente();
        }

        return null;
    }

    public NodoRestaurante getNodo(String restaurante) {
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getNombre().equals(restaurante)) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public char[] getDireccionesRestaurantes() {
        char[] direcciones = new char[getTamano()];
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            direcciones[i] = aux.getDireccion();
            aux = aux.getSiguiente();
        }
        return direcciones;
    }

    public void setMenus(String restaurante, String agregado) {
        NodoRestaurante aux = getPrimero();
        String menuActual = "";
        for (int i = 0; i < getTamano(); i++) {
            if (restaurante.equals(aux.getNombre())) {
                for (int j = 0; j < aux.getMenu().length; j++) {
                    menuActual += aux.getMenu()[j] + "/";

                }
                break;
            }
            aux = aux.getSiguiente();
        }
        agregado = menuActual + agregado;
        agregado = agregado.substring(0, agregado.length() - 1);
        System.out.println(agregado);
        aux.setMenu(agregado.split("/"));
    }

    public void EliminarPlato(String restaurante, String plato) {
        NodoRestaurante aux = getPrimero();
        String menuActual = "";
        for (int i = 0; i < getTamano(); i++) {
            if (restaurante.equals(aux.getNombre())) {
                for (int j = 0; j < aux.getMenu().length; j++) {
                    menuActual += aux.getMenu()[j] + "/";

                }
                break;
            }
            aux = aux.getSiguiente();
        }

        menuActual = menuActual.replace(plato + "/", "");
        menuActual = menuActual.substring(0, menuActual.length() - 1);
        aux.setMenu(menuActual.split("/"));

    }

    public boolean existeDireccion(String direccion) {
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getDireccion()== direccion.charAt(0)) {
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
            NodoRestaurante aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += "Direccion: " + aux.getDireccion() + ", " + "Nombre: " + aux.getNombre() + "\n";
                aux = aux.getSiguiente();
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

    public NodoRestaurante getPrimero() {
        return primero;
    }

    public void setPrimero(NodoRestaurante primero) {
        this.primero = primero;
    }

    public NodoRestaurante getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoRestaurante ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}
