/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * Esta clase es utilizada para crear el NodoPedido, usado posteriormente para
 * la ListaPedido
 *
 */
public class NodoPedido {

    //Campos de la clase
    private NodoPedido siguiente;
    private char direccionCliente;
    private char direccionRestaurante;
    private String pedido;

    /**
     *
     * Constructor de NodoCliente
     *
     */
    public NodoPedido(char direccionCliente, char direccionRestaurante, String pedido) {
        this.direccionCliente = direccionCliente;
        this.direccionRestaurante = direccionRestaurante;
        this.pedido = pedido;
    }
    
    //Getter y setters
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

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

}
