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
                            listaPedidos.agregarFinal(pedidos_split[0].charAt(0), pedidos_split[1].charAt(0), pedidos_split[2]);
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
                            listaPedidos.agregarFinal(pedidos_split[0].charAt(0), pedidos_split[1].charAt(0), pedidos_split[2]);
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
            JOptionPane.showMessageDialog(null, "Se actualizó el repositorio correctamente.");
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

    public void generarArchivoGraphviz(Listas listas) {

        String info = "digraph G" + "\n"
                + "{" + "\n"
                + "rankdir=LR;" + "\n";
        char[] nodos = getDirecciones(listas);

        for (int i = 0; i < nodos.length; i++) {
            info += nodos[i] + ";" + "\n";
        }

        ListaRutas listaRutas = listas.getListaRutas();

        info += listaRutas.getRutasGraphviz();
        info += "}" + "\n";

        try {
            PrintWriter pw = new PrintWriter("test\\grafo.txt");
            pw.print(info);
            pw.close();

        } catch (Exception e) {

        }
    }

    public void generarGrafoJpg(Listas listas) {
        try {
            this.generarArchivoGraphviz(listas);
            //path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
            String dotPath = "C:\\Program Files\\Graphviz\\bin\\dot.exe";

            //path del archivo creado con el codigo del graphviz que queremos
            String fileInputPath = "test\\grafo.txt";
            //path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz
            String fileOutputPath = "test\\grafoImagen.jpg";

            //tipo de imagen de salida, en este caso es jpg
            String tParam = "-Tjpg";

            String tOParam = "-o";

            //concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas
            //recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            //Invocamos nuestra clase 
            Runtime rt = Runtime.getRuntime();

            //Ahora ejecutamos como lo hacemos en consola
            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

    public boolean validaDireccionRest(String cadena) {
        if (cadena.length() != 1) {
            return false;
        }
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
                return false;
            }
        }
        return true;
    }

    public boolean validaDirecionCliente(String cadena) {

        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    
    

}
