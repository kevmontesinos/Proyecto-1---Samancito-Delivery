/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * Clase que guarda todas las listas enlazadas donde está la información del programa
 *

 */
public class Listas {

    //Campos de la clase
    private ListaRestaurantes listaRestaurantes;
    private ListaClientes listaClientes;
    private ListaPedidos listaPedidos;
    private ListaRutas listaRutas;
    private ListaDirecciones listaDirecciones;

    public Listas(ListaRestaurantes listaRestaurantes, ListaClientes listaClientes, ListaPedidos listaPedidos, ListaRutas listaRutas) {
        this.listaRestaurantes = listaRestaurantes;
        this.listaClientes = listaClientes;
        this.listaPedidos = listaPedidos;
        this.listaRutas = listaRutas;
        this.listaDirecciones = new ListaDirecciones();
    }

    //Getters y setters
    public ListaRestaurantes getListaRestaurantes() {
        return listaRestaurantes;
    }

    public void setListaRestaurantes(ListaRestaurantes listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    public ListaClientes getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ListaPedidos getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public ListaRutas getListaRutas() {
        return listaRutas;
    }

    public void setListaRutas(ListaRutas listaRutas) {
        this.listaRutas = listaRutas;
    }

    public ListaDirecciones getListaDirecciones() {
        return listaDirecciones;
    }

    public void setListaDirecciones(ListaDirecciones listaDirecciones) {
        this.listaDirecciones = listaDirecciones;
    }

}
