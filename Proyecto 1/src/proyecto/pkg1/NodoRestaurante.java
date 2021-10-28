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
public class NodoRestaurante {
    
    private NodoRestaurante siguiente;
    private char direccion;
    private String nombre;
    private String[] menu;
    
    public NodoRestaurante(char direccion, String nombre, String[] menu){
        this.direccion = direccion;
        this.nombre = nombre;
        this.menu = menu;
        this.siguiente = null;
        
    }

    public NodoRestaurante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRestaurante siguiente) {
        this.siguiente = siguiente;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }
    
}
