/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene el algoritmo de Dijkstra para obtener el camino más corto
 * a partir de una matriz de adyacencia.
 *
 */
public class Dijkstra {

    //Campos de la clase
    private static final int NO_PARENT = -1;
    ListaDirecciones ld;
    String restaurante;
    String caminoMasCorto;

    /**
     *
     * Método que inializa las variables y llama las funciones para hacer el
     * camino más corto, a partir de los parámetro pasados
     *
     * @param adjacencyMatrix matriz de adyacencia del respectivo grafo
     * @param startVertex posicion de la dirección del cliente con respecto a
     * ListaClientes (origen)
     * @param ld lista con la información de las direcciones
     * @param restaurante direccion del restaurante (destino)
     *
     */
    public void Dijkstra(int[][] adjacencyMatrix, int startVertex, ListaDirecciones ld, String restaurante) {
        int nVertices = adjacencyMatrix[0].length;
        this.ld = ld;
        this.restaurante = restaurante;
        this.caminoMasCorto = "El camino más corto es: \n";

        int[] shortestDistances = new int[nVertices];

        boolean[] added = new boolean[nVertices];

        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        shortestDistances[startVertex] = 0;

        int[] parents = new int[nVertices];

        parents[startVertex] = NO_PARENT;

        for (int i = 1; i < nVertices; i++) {

            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            added[nearestVertex] = true;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance
                            + edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    public void printSolution(int startVertex, int[] distances, int[] parents) {
        int nVertices = distances.length;
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            if (vertexIndex != startVertex) {
                if (ld.getValor(vertexIndex).equals(restaurante)) {
                    printPath(vertexIndex, parents);
                }
            }
        }
        caminoMasCorto = caminoMasCorto.substring(0, caminoMasCorto.length() - 4);
        JOptionPane.showMessageDialog(null, caminoMasCorto);
    }

    public void printPath(int currentVertex, int[] parents) {

        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents);
        caminoMasCorto += ld.getValor(currentVertex) + " ==> ";
    }
}

//El código fue basado en el expuesto en https://www.geeksforgeeks.org/printing-paths-dijkstras-shortest-path-algorithm/ 
// creado por Harikrishnan Rajan, sin embargo, fue adaptado a los requerimiento del 
//proyecto en cuestión
