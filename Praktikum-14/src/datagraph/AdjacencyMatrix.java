/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datagraph;

/**
 *
 * @author HP
 */
public class AdjacencyMatrix {
    public static int[][] createGraph(int numVertices) {
        return new int [numVertices][numVertices];
    }
    
    public static void addEdge(int[][] graph, int vertex1,int vertex2) {
        graph[vertex1][vertex2] = 1;
        graph[vertex2][vertex1] = 1;
    }
    
    public static void displayGraph(int[][] graph) {
        for(int i = 0; i<graph.length; i++) {
            for(int j = 0; j<graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            } 
            
            System.out.println();
        }
    }
}
