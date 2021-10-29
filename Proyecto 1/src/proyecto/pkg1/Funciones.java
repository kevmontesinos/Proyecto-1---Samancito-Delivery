/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;


/**
 *
 * @author Kevin
 */
public class Funciones {

    public void leerTxt(ListaRestaurantes listaRestaurantes, ListaClientes listaClientes) {
        String line;
        String txt = ""; //donde se guardará todo
        String path = "test\\data.txt";
        String[] rutas_array = null;
        File file = new File(path); //se crea el archivo o se puede conseguir
        try {
            if (!file.exists()) {
                file.createNewFile(); //si el archivo no existe, lo crea
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + "\n";
                    }

                }
                if (!"".equals(txt) && !txt.isEmpty()) { //se verifica que en txt haya algo

                    String[] txt_split = txt.split("\n");
                    int i = 0;
                    if ("Restaurantes".equals(txt_split[i])) {
                        i++;
                        while (!txt_split[i].equals("Clientes")) {
                            String[] restaurantes_split = txt_split[i].split(",");
                            listaRestaurantes.agregarFinal(restaurantes_split[0].charAt(0), restaurantes_split[1], restaurantes_split[2].split("/"));
                            i++;
                        }
                    }
                    if ("Clientes".equals(txt_split[i])) {
         
                        i++;
                        while (!txt_split[i].equals("Pedidos")) {
                            
                            String[] clientes_split = txt_split[i].split(",");
                            listaClientes.agregarFinal(clientes_split[0].charAt(0), clientes_split[1], clientes_split[2], Integer.parseInt(clientes_split[3]));
                            i++;
                        }

                    }

//                    boolean rutas = false;
//                    int posicion = 0;
//                    for(int i=0; i < txt_split.length; i++){
//                        if ("Rutas".equals(txt_split[i])){
//                            rutas = true;
//                            rutas_array = new String[(txt_split.length - i) - 1];
//                            i++;
//                            
//                        }
//                        
//                        if (rutas){
//                            System.out.println(rutas_array.length);
//                            rutas_array[posicion] = txt_split[(i)];
//                            posicion ++;
//                        }
//                        
//                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");
        }
    }

}
