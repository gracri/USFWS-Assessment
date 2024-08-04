package org.example;

import java.util.HashSet;
import java.util.Set;

public class Vertex {
    private final String id;
    private final Set<Edge> edges;
    public Vertex(String id) {
        this.id = id;
        this.edges = new HashSet<>();
    }
    public void addEdge(Vertex to) {
        edges.add(new Edge(this, to));
    }
    public String getId(){
        return this.id;
    }
    public Set<Edge> getEdges(){
        return this.edges;
    }
}
