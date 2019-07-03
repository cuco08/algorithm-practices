package com.galeanos.algorithm.graphs.edgeexistence;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

public class EdgeExistenceInputFile {
    public static void main (String ... args) throws Exception {
        final List<String> inputList = FileUtils.readLines(new File("src/main/resources/input01.txt"),
                Charset.defaultCharset().defaultCharset());

        final String[] input = inputList.get(0).split(" ");
        final int nodes = Integer.valueOf(input[0]);
        final int edges = Integer.valueOf(input[1]);
        final boolean[][] undirectedGraph = new boolean[nodes][nodes];

        for (int i=1; i<=edges; ++i) {
            final String[] edgeInput = inputList.get(i).split(" ");
            final int fromNode = Integer.valueOf(edgeInput[0]);
            final int toNode = Integer.valueOf(edgeInput[1]);
            undirectedGraph[fromNode-1][toNode-1] = true;
            undirectedGraph[toNode-1][fromNode-1] = true;
        }

        final int totalQueries = Integer.valueOf(inputList.get(edges+1));
        for (int i=edges+2; i<edges+2+totalQueries; ++i) {
            final String[] queryInput = inputList.get(i).split(" ");
            final int fromNode = Integer.valueOf(queryInput[0]);
            final int toNode = Integer.valueOf(queryInput[1]);
            System.out.println(undirectedGraph[fromNode-1][toNode-1] || undirectedGraph[toNode-1][fromNode-1]?
                    "YES": "NO");
        }
    }
}
