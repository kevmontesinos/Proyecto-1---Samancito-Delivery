/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

/**
 *
 * @author rober
 */
public class DFS {

    public static void dfs(int i, int[][] graph, boolean[] visited, ListaDirecciones ld) {
        if (!visited[i]) {
            visited[i] = true; // Mark node as "visited"
            System.out.print(ld.getValor(i) + " ");

            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1 && !visited[j]) {
                    dfs(j, graph, visited, ld); // Visit node
                }
            }
        }
    }
}
