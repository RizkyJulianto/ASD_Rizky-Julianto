/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datagraph;

import static datagraph.AdjacencyMatrix.addEdge;
import static datagraph.AdjacencyMatrix.createGraph;
import static datagraph.AdjacencyMatrix.displayGraph;

/**
 *
 * @author HP
 */
public class DataGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numVertices = 5;
        int[][] myGraph  = createGraph(numVertices);
        
        addEdge(myGraph,0,1);
        addEdge(myGraph,0,2);
        addEdge(myGraph,1,3);
        addEdge(myGraph,2,4);
        
        
        displayGraph(myGraph);
    }
    
}
