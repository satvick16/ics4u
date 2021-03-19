/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author satvi
 */
public class Graph {
    
    private int numNodes;
    private int numEdges;

    private ArrayList<ArrayList<Integer>> adjList;
    
    public Graph() {
        this.numNodes = 0;
        this.numEdges = 0;
        this.adjList = new ArrayList<>();
    }
    
    public double getNumNodes() {
        return this.numNodes;
    }
    
    public double getNumEdges() {
        return this.numEdges;
    }
    
    @Override
    public String toString() {
        String s = new String();
        
        for (int i = 0; i < this.adjList.size(); i++) {
            s += "Neighbours of node " + i + ": " + this.adjList.get(i) + "\n";
        }
        
        return s;
    }
    
    public boolean equals(Graph g) {
        return this.adjList.equals(g.adjList);
    }
    
    public void addNode() {
        this.numNodes++;
        this.adjList.add(new ArrayList<>());
    }
    
    public void addEdge(int a, int b) {
        this.numEdges++;
        this.adjList.get(a).add(b);
        this.adjList.get(b).add(a);
        Collections.sort(this.adjList.get(a));
        Collections.sort(this.adjList.get(b));
    }
    
    public void removeEdge(int a, int b) {
        this.numEdges--;
        this.adjList.get(a).remove((Integer) b);
        this.adjList.get(b).remove((Integer) a);
    }
    
    public boolean isAdjacent(int a, int b) {
        return this.adjList.get(a).contains(b);
    }
    
    public boolean isConnected(int a, int b) {
        // decide whether to use bfs or dfs
        return true;
    }
    
    public int shortestPath(int a, int b) {
        if (this.isConnected(a, b)) {
            int[] distance = new int[this.adjList.size()];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[a] = 0;
            
            ArrayList<Integer> q = new ArrayList<>();
            q.add(a);
            
            boolean[] processed = new boolean[this.adjList.size()];
            Arrays.fill(processed, false);
            
            while (q.size() > 0) {
                int s = q.get(0);
                q.remove(0);
                
                if (processed[s]) {
                    continue;
                }
                
                processed[s] = true;
                
                for (Integer neighbour : this.adjList.get(s)) {
                    if (distance[s] + 1 < distance[neighbour]) {
                        distance[neighbour] = distance[s] + 1;
                        q.add(neighbour);
                    }
                }
            }
            return distance[b];
        } else {
            return -1;
        }
    }
    
}
