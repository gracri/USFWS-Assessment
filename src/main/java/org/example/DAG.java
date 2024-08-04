package org.example;

import java.util.*;

public class DAG {
    public final Vertex root;
    private final List<Vertex> vertices;
    public DAG() {
        this.vertices = initializeDAG();
        this.root = vertices.get(0);
    }
    private List<Vertex> initializeDAG(){
        var vertexA = new Vertex("a");
        var vertexB = new Vertex("b");
        var vertexC = new Vertex("c");
        var vertexD = new Vertex("d");
        var vertexE = new Vertex("e");

        vertexA.addEdge(vertexB);
        vertexA.addEdge(vertexC);
        vertexB.addEdge(vertexE);
        vertexE.addEdge(vertexD);
        vertexC.addEdge(vertexD);

        return new ArrayList<>(Arrays.asList(vertexA, vertexB, vertexC, vertexD, vertexE));
    }
    public List<String> getLongestDirectedPath(String startId){
        return new ArrayList<String>();
    }
}
