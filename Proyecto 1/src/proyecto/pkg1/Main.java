
package proyecto.pkg1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ListaRestaurantes listaRestaurantes = new ListaRestaurantes();
        ListaClientes listaClientes = new ListaClientes();
        ListaPedidos listaPedidos = new ListaPedidos();
        ListaRutas listaRutas = new ListaRutas();
        
        
        
        Funciones f = new Funciones();
        
        
        
        f.leerTxtPred(listaRestaurantes, listaClientes, listaPedidos, listaRutas);
       // f.leerTxtCargado(listaRestaurantes, listaClientes);
        
       listaClientes.agregarFinal('7', "Kevin", "Montesinos", 28416348);
       String[] menu = {"gsgkskg", "hdjfhajsdfa","njdfajdf"};
       listaRestaurantes.agregarFinal('F', "Subway", menu);
       String[] pedido = {"3-Holy Tempeh","1-Holy Chicken Tenders"};
       listaPedidos.agregarFinal('8', 'Z', pedido);
       listaRutas.agregarFinal('Z', '5', 22);
       
       
       f.escribirTxt(listaRestaurantes, listaClientes, listaPedidos, listaRutas);
       

       
        //VentanaGeneral vg = new VentanaGeneral();
        
//        listaRestaurantes.imprimirLista();
//        JOptionPane.showMessageDialog(null, listaRestaurantes.getInformacionLista());
//        JOptionPane.showMessageDialog(null, listaClientes.getInformacionLista());
//        JOptionPane.showMessageDialog(null, listaPedidos.getInformacionLista());
//        JOptionPane.showMessageDialog(null, listaRutas.getInformacionLista());
        
//        listaClientes.imprimirLista();
//        listaPedidos.imprimirLista();
//        listaRutas.imprimirLista();
        
        
        
        
    }
    
}
