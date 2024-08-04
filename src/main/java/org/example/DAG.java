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
    private Vertex getVertexById(String id){
        Optional<Vertex> vertex = vertices.stream().filter(v -> v.getId().equals(id)).findFirst();
        return vertex.orElseThrow(() -> new NoSuchElementException("Vertex with ID " + id + " not found"));
    }
    public List<String> getLongestDirectedPath(String startId){
        Vertex start = getVertexById(startId);
        Vertex end = getEndVertex();
        ArrayList<String> longestPath = new ArrayList<>();
        return longestPath;
    }
    private Vertex getEndVertex() {
        Optional<Vertex> endVertex = vertices.stream().filter(v -> v.getEdges().isEmpty()).findFirst();
        return endVertex.orElseThrow(() -> new NoSuchElementException("End Vertex not found"));
    }
}
