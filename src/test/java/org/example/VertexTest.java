package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class VertexTest {

    private Vertex vertexA;
    private Vertex vertexB;
    private Vertex vertexC;

    @BeforeEach
    public void setUp() {
        vertexA = new Vertex("a");
        vertexB = new Vertex("b");
        vertexC = new Vertex("c");
    }

    @Test
    void addEdge() {
        vertexA.addEdge(vertexB);
        vertexA.addEdge(vertexC);

        Set<Edge> edges = vertexA.getEdges();
        assertEquals(2, edges.size());
        assertTrue(edges.stream().anyMatch(e -> e.getTo().equals(vertexB)));
        assertTrue(edges.stream().anyMatch(e -> e.getTo().equals(vertexC)));
        assertTrue(edges.stream().allMatch(e -> e.getFrom().equals(vertexA)));
    }

    @Test
    void getId() {
        assertEquals("a", vertexA.getId());
        assertEquals("b", vertexB.getId());
        assertEquals("c", vertexC.getId());
    }
}