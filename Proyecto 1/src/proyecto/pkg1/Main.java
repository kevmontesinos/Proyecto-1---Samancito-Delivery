
package proyecto.pkg1;

public class Main {

    public static void main(String[] args) {
        ListaRestaurantes listaRestaurantes = new ListaRestaurantes();
        ListaClientes listaClientes = new ListaClientes();
        ListaPedidos listaPedidos = new ListaPedidos();
        
        
        Funciones f = new Funciones();
        
        
        
        f.leerTxtPred(listaRestaurantes, listaClientes, listaPedidos);
       // f.leerTxtCargado(listaRestaurantes, listaClientes);
        
        //VentanaGeneral vg = new VentanaGeneral();
        
        listaRestaurantes.imprimirLista();
        listaClientes.imprimirLista();
        listaPedidos.imprimirLista();
        
        
        
    }
    
}
