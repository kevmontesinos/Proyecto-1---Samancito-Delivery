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
public class Listas {

    private ListaRestaurantes listaRestaurantes;
    private ListaClientes listaClientes;
    private ListaPedidos listaPedidos;
    private ListaRutas listaRutas;

    public Listas(ListaRestaurantes listaRestaurantes, ListaClientes listaClientes, ListaPedidos listaPedidos, ListaRutas listaRutas){
        this.listaRestaurantes = listaRestaurantes;
        this.listaClientes =  listaClientes;
        this.listaPedidos =  listaPedidos;
        this.listaRutas =  listaRutas;
    } 

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
    
    
    
}
