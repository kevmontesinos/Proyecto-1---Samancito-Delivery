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
public class MatrizAdyacencia {

    int numNodos;
    int[][] matriz;
    int[] valores;
    int posicion;

    public MatrizAdyacencia(int numNodos) {
        this.numNodos = numNodos;
        this.matriz = new int[numNodos][numNodos];
        this.posicion = 0;
        this.valores = new int[numNodos];
    }

    public void agregarVert(int origen, int destino) {
        matriz[origen][destino] = 1;
    }

    public void agregarVert(int origen, int destino, int peso) {

        matriz[origen][destino] = peso;

    }

    /**
     *
     * Método la matriz de adyacencia sin los pesos correspondientes, utilizada
     * posteriormente para el recorridos DFS
     *
     * @return matriz de adyacencia sin los pesos correspondientes
     *
     */
    public int[][] getMatrizSP() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (matriz[i][j] == 0) {
                    matriz[i][j] = 0;
                }

            }
        }
        return matriz;
    }

    /**
     *
     * Método la matriz de adyacencia con los pesos correspondientes, utilizada para el algoritmo de Dijkstra
     *
     * @return matriz de adyacencia con los pesos correspondientes
     *
     */
    public int[][] getMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (matriz[i][j] == 0) {
                    matriz[i][j] = 999;
                }

            }
        }
        return matriz;
    }

}
