/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Funciones {

    public Listas leerTxtPred() {
        ListaRestaurantes listaRestaurantes = new ListaRestaurantes();
        ListaClientes listaClientes = new ListaClientes();
        ListaPedidos listaPedidos = new ListaPedidos();
        ListaRutas listaRutas = new ListaRutas();

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
                    if ("Pedidos".equals(txt_split[i])) {
                        i++;
                        while (!txt_split[i].equals("Rutas")) {
                            String[] pedidos_split = txt_split[i].split(",");
                            listaPedidos.agregarFinal(pedidos_split[0].charAt(0), pedidos_split[1].charAt(0), pedidos_split[2].split("/"));
                            i++;
                        }
                    }
                    if ("Rutas".equals(txt_split[i])) {
                        i++;
                        while (i < txt_split.length) {
                            String[] rutas_split = txt_split[i].split(",");
                            listaRutas.agregarFinal(rutas_split[0].charAt(0), rutas_split[1].charAt(0), Integer.parseInt(rutas_split[2]));
                            i++;

                        }
                    }

                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");
        }

        return new Listas(listaRestaurantes, listaClientes, listaPedidos, listaRutas);
    }

    public Listas leerTxtCargado() {
        ListaRestaurantes listaRestaurantes = new ListaRestaurantes();
        ListaClientes listaClientes = new ListaClientes();
        ListaPedidos listaPedidos = new ListaPedidos();
        ListaRutas listaRutas = new ListaRutas();

        String line;
        String txt = ""; //donde se guardará todo

        try {
            JFileChooser fileC = new JFileChooser();
            fileC.showOpenDialog(null);
            File file = fileC.getSelectedFile();
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
                    if ("Pedidos".equals(txt_split[i])) {
                        i++;
                        while (!txt_split[i].equals("Rutas")) {
                            String[] pedidos_split = txt_split[i].split(",");
                            listaPedidos.agregarFinal(pedidos_split[0].charAt(0), pedidos_split[1].charAt(0), pedidos_split[2].split("/"));
                            i++;
                        }
                    }
                    if ("Rutas".equals(txt_split[i])) {
                        i++;
                        while (i < txt_split.length) {
                            String[] rutas_split = txt_split[i].split(",");
                            listaRutas.agregarFinal(rutas_split[0].charAt(0), rutas_split[1].charAt(0), Integer.parseInt(rutas_split[2]));
                            i++;

                        }
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");
        }
        return new Listas(listaRestaurantes, listaClientes, listaPedidos, listaRutas);

    }

    public void escribirTxt(Listas listas) {
        ListaRestaurantes listaRestaurantes = listas.getListaRestaurantes();
        ListaClientes listaClientes = listas.getListaClientes();
        ListaPedidos listaPedidos = listas.getListaPedidos();
        ListaRutas listaRutas = listas.getListaRutas();

        String info = "";
        info += listaRestaurantes.getInformacionLista();
        info += listaClientes.getInformacionLista();
        info += listaPedidos.getInformacionLista();
        info += listaRutas.getInformacionLista();

        try {
            PrintWriter pw = new PrintWriter("test\\data.txt");
            pw.print(info);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }

    }

    public char[] getDirecciones(Listas listas) {
        char[] dirClientes = listas.getListaClientes().getDireccionesClientes();
        char[] dirRest = listas.getListaRestaurantes().getDireccionesRestaurantes();
        char[] direcciones = new char[dirClientes.length + dirRest.length];

        int j = 0;
        for (int i = 0; i < dirRest.length; i++) {
            direcciones[j] = dirRest[i];
            j++;
        }
        for (int i = 0; i < dirClientes.length; i++) {
            direcciones[j] = dirClientes[i];
            j++;
        }

       return direcciones;
    }

}
