package org.example;

import java.util.*;

public class DAG {
    private final List<Vertex> vertices;
    public DAG() {
        this.vertices = initializeDAG();
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
        if (startId == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        Vertex start = getVertexById(startId);
        Vertex end = getEndVertex();
        ArrayList<String> longestPath = new ArrayList<>();
        Map<Vertex, Integer> distances = new HashMap<>();
        Map<Vertex, Vertex> previous = new HashMap<>();
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (Vertex vertex : vertices) {
            distances.put(vertex, -1);
            previous.put(vertex, null);
        }
        distances.put(start, 0);
        priorityQueue.add(start);

        while (!priorityQueue.isEmpty()) {
            Vertex current = priorityQueue.poll();
            for (Edge edge : current.getEdges()) {
                Vertex next = edge.getTo();
                int newDist = distances.get(current) + 1;
                if (newDist > distances.get(next)) {
                    distances.put(next, newDist);
                    previous.put(next, current);
                    priorityQueue.add(next);
                }
            }
        }
        for (Vertex vertex = end; vertex != null; vertex = previous.get(vertex)) {
            longestPath.add(vertex.getId());
        }
        Collections.reverse(longestPath);
        return longestPath;
    }
    private Vertex getEndVertex() {
        Optional<Vertex> endVertex = vertices.stream().filter(v -> v.getEdges().isEmpty()).findFirst();
        return endVertex.orElseThrow(() -> new NoSuchElementException("End Vertex not found"));
    }
}
