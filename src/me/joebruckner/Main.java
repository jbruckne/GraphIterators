package me.joebruckner;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Breadth First Search Tests");
        System.out.println("--------------------------");

        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(5, 6);

        Iterator<Object> bfs = new BreadthFirstSearch(graph, 0);
        while (bfs.hasNext())
            System.out.print(bfs.next().toString() + " ");

        System.out.println("\n\nDepth First Search Tests");
        System.out.println( "-------------------------");

        Iterator<Object> dfs = new DepthFirstSearch(graph, 0);
        while (dfs.hasNext())
            System.out.print(dfs.next().toString() + " ");

        System.out.println("\n\nEnd of Tests");
    }
}