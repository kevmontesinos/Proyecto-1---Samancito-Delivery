/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaRestaurantes que
 * servirá para el manejo de los datos referentes a los restaurantes
 *
 *
 */
public class ListaRestaurantes {

    //Campos de la clase
    private NodoRestaurante primero;
    private NodoRestaurante ultimo;
    private int tamano;

    /**
     *
     * Constructor de ListaRestaurantes
     *
     */
    public ListaRestaurantes() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

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
     * @param direccion direccion del restaurante
     * @param nombre nombre del restaurante
     * @param menu menú con los platos del restaurante
     */
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

    /**
     *
     * Método que te devuelve el la información del menú agrgandole la
     * informacion del nodo
     *
     * @param nodo NodoRestaurante
     * @return información del menú
     *
     */
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

    /**
     *
     * Método que te devuelve la información de los campos de la lista separados
     * con coma
     *
     * @return informacion de los campos de la lista
     *
     */
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

    /**
     *
     * Método que te devuelve una lista con los nombres de los restaurantes de
     * la lista
     *
     * @return lista con las nombres de los restaurantes
     *
     */
    public String[] getArrayRest() {
        String[] restaurantes = new String[getTamano()];
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            restaurantes[i] = aux.getNombre();
            aux = aux.getSiguiente();
        }
        return restaurantes;
    }

    /**
     *
     * Método que te devuelve una lista con el menú del nombre del restaurante
     * que se pase por parámetro
     *
     * @param restaurante nombre del restaurante que se quiere buscar el menú
     * @return lista con el menú de un restaurante
     *
     */
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

    /**
     * Método que agrega un plato a un restaurante
     *
     * @param restaurante restaurante que se quiere agregar el plato
     * @param plato plato a agregar
     *
     */
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

    /**
     * Método que elimina un plato de un restaurante
     *
     * @param restaurante restaurante que se quiere eliminar el plato
     * @param plato plato a eliminar
     *
     */
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

    /**
     * Método que devuelve un booleano dependiendo de si existe la direccion que
     * se pase por parámetro
     *
     * @param direccion direccion del restaurante
     *
     * @return booleano
     */
    public boolean existeDireccion(String direccion) {
        NodoRestaurante aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getDireccion() == direccion.charAt(0)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    //Getters y setters
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
