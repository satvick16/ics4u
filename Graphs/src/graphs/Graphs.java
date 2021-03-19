/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author satvi
 */
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Graph g1 = new Graph();
        
        for (int i = 0; i <= 6; i++) {
            g1.addNode();
        }
        
        System.out.println(g1);
        
        System.out.println("Number of nodes: " + g1.getNumNodes());
        
        g1.addEdge(0, 1);
        g1.addEdge(1, 2);
        g1.addEdge(1, 4);
        g1.addEdge(2, 3);
        g1.addEdge(2, 5);
        g1.addEdge(3, 6);
        g1.addEdge(5, 6);
        
        System.out.println("Number of edges: " + g1.getNumEdges() + "\n");
        
        g1.addEdge(1, 6);
        System.out.println(g1);
        
        g1.removeEdge(1, 6);
        System.out.println(g1);
        
        System.out.println("Is there a path from node 1 to node 6? " + g1.isAdjacent(1, 6));
        System.out.println("Is there a path from node 1 to node 4? " + g1.isAdjacent(1, 4));
        
        System.out.println("Length of shortest path from node 4 to 6: " + g1.shortestPath(4, 6));
    }
    
}
