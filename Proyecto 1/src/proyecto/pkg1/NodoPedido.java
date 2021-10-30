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
public class NodoPedido {
    private NodoPedido siguiente;
    private char direccionCliente;
    private char direccionRestaurante;
    private String[] pedidos;
      
    public NodoPedido (char direccionCliente, char direccionRestaurante, String[] pedidos){
        this.direccionCliente = direccionCliente;
        this.direccionRestaurante = direccionRestaurante;
        this.pedidos = pedidos;
    }

    public NodoPedido getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPedido siguiente) {
        this.siguiente = siguiente;
    }

    public char getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(char direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public char getDireccionRestaurante() {
        return direccionRestaurante;
    }

    public void setDireccionRestaurante(char direccionRestaurante) {
        this.direccionRestaurante = direccionRestaurante;
    }

    public String[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(String[] pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
}
