/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import java.util.*;

/**
 *
 * @author HP
 */
public class ListAdjacency {
    private final Map<Integer, List<Integer>> adjacencyList;
    
    
    public ListAdjacency() {
    adjacencyList = new HashMap<>();
}
    
    public void addEdge(int vertex1,int vertex2 ) {
        adjacencyList.computeIfAbsent(vertex1, k -> new ArrayList<>()).add(vertex2);
        adjacencyList.computeIfAbsent(vertex2, k -> new ArrayList<>()).add(vertex1);
    }
    
    public void printGraph() {
        for(Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            
            System.out.print("Vertex " + vertex + ": ");
            for(int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ListAdjacency graph = new ListAdjacency();
        
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        
        System.out.println("Adjacency List :");
        graph.printGraph();
    }
}
