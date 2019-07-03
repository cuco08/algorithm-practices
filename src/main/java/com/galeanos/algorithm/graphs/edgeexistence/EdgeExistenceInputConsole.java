package com.galeanos.algorithm.graphs.edgeexistence;

import java.util.Scanner;

public class EdgeExistenceInputConsole {
    public static void main (String ... args) {
        final Scanner s = new Scanner(System.in);
        final String inputString = s.nextLine();

        final String[] input = inputString.split(" ");
        final int nodes = Integer.valueOf(input[0]);
        final int edges = Integer.valueOf(input[1]);
        final boolean[][] undirectedGraph = new boolean[nodes][nodes];

        for (int i=1; i<=edges; ++i) {
            final String inputEdgeString = s.nextLine();
            final String[] edgeInput = inputEdgeString.split(" ");
            final int fromNode = Integer.valueOf(edgeInput[0]);
            final int toNode = Integer.valueOf(edgeInput[1]);
            undirectedGraph[fromNode-1][toNode-1] = true;
            undirectedGraph[toNode-1][fromNode-1] = true;
        }

        final int totalQueries = Integer.valueOf(s.nextLine());
        final String[] inputQueries = new String[totalQueries];
        for (int i=0; i<totalQueries; ++i) {
            inputQueries[i] = s.nextLine();
        }

        for (String query: inputQueries) {
            final String[] queryInput = query.split(" ");
            final int fromNode = Integer.valueOf(queryInput[0]);
            final int toNode = Integer.valueOf(queryInput[1]);
            System.out.println(undirectedGraph[fromNode-1][toNode-1] || undirectedGraph[toNode-1][fromNode-1]?
                    "YES": "NO");
        }
    }
}
