
package proyecto.pkg1;

public class Main {

    public static void main(String[] args) {
        ListaRestaurantes listaRestaurantes = new ListaRestaurantes();
        ListaClientes listaClientes = new ListaClientes();
        
        Funciones f = new Funciones();
        
        f.leerTxt(listaRestaurantes, listaClientes);
        
        listaRestaurantes.imprimirLista();
        listaClientes.imprimirLista();
        
        
        
    }
    
}
