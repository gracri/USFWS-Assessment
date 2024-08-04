package org.example;

public class Main {
    public static void main(String[] args) {
        DAG dag = new DAG();
        System.out.println(dag.getLongestDirectedPath("a"));
    }
}