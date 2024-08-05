package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DAGTest {
    private DAG dag;

    @BeforeEach
    void setUp() {
        dag = new DAG();
    }

    @Test
    void getLongestDirectedPath() {
        List<String> result = new ArrayList<>(Arrays.asList("a", "b", "e", "d"));
        assertEquals(result, dag.getLongestDirectedPath("a"));
    }

    @Test
    public void testNullVertexIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> dag.getLongestDirectedPath(null));
    }

    @Test
    public void testInvalidVertexIdThrowsException() {
        assertThrows(NoSuchElementException.class, () -> dag.getLongestDirectedPath("z"));
    }
}