/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datagraph;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class WeightedUndirectGraph {
    private final int[][] adjacencyMatrix;
    private final int vertices;
    
    
    public WeightedUndirectGraph(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
        for(int i = 0; i < vertices; i++) {
            Arrays.fill(adjacencyMatrix[i], Integer.MAX_VALUE);
        }
    }
    
    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }
    public void printMatrix() {
    System.out.println("Weighted Adjacency Matrix:");
    for(int i = 0; i < vertices; i++) {
        for(int j = 0; j < vertices; j++) {
            if(adjacencyMatrix[i][j] == Integer.MAX_VALUE) {
                System.out.print("INF\t");
            } else {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
        }
        
        System.out.println();
    }
    
    }
    
    public static void main(String[] args) {
        int vertices = 4;
        WeightedUndirectGraph graph = new WeightedUndirectGraph(vertices);
        
        
        graph.addEdge(0,1,2);
        graph.addEdge(0,2,4);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,7);
        graph.addEdge(2,3,3);
        
        graph.printMatrix();
    }
}


