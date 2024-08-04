package org.example;

import java.util.Set;

public class Vertex {
    private final long id;
    private final Set<Edge> edges;

    public Vertex(long id, Set<Edge> edges) {
        this.id = id;
        this.edges = edges;
    }

    public long getId(){
        return this.id;
    }

    public Set<Edge> getEdges(){
        return this.edges;
    }
}
