/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class DFS {

    String recorrido;
    int recorridos;

    public DFS() {
        recorrido = "";
        recorridos = 0;
    }

    public void dfs(int i, int[][] graph, boolean[] visited, ListaDirecciones ld) {
        if (!visited[i]) {
            visited[i] = true; // Mark node as "visited"
            recorrido += ld.getValor(i) + " - ";
            recorridos++;

            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1 && !visited[j]) {
                    dfs(j, graph, visited, ld); // Visit node

                }
            }
        }
        if (recorridos == graph.length){
            recorrido = recorrido.substring(0,recorrido.length() - 2);
            JOptionPane.showMessageDialog(null, recorrido);
            
        }
    }
}
