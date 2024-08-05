package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {
    private Vertex vertexA;
    private Vertex vertexB;
    private Edge edge;

    @BeforeEach
    public void setUp() {
        vertexA = new Vertex("a");
        vertexB = new Vertex("b");
        edge = new Edge(vertexA, vertexB);
    }

    @Test
    public void testGetFrom() {
        assertEquals(vertexA, edge.getFrom());
    }

    @Test
    public void testGetTo() {
        assertEquals(vertexB, edge.getTo());
    }

}