package com.galeanos.algorithm.graphs.bfs;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

public class Main {
    public static void main(String ... args) throws Exception {
        final Graph graph = new Graph();

        final List<String> inputList = FileUtils.readLines(new File("src/main/resources/graph01.txt"),
                Charset.defaultCharset().defaultCharset());

        inputList.stream().forEach(input -> {
            final String[] in = input.split(" ");
            Node fromNode = Node.builder().value(Short.valueOf(in[0])).build();
            Node toNode = Node.builder().value(Short.valueOf(in[1])).build();

            graph.addEdge(fromNode, toNode);
            graph.addEdge(toNode, fromNode);
        });

        System.out.println("Graph : \n" + graph);
        final BFS bfs = new BFS(graph);
        final Node node = Node.builder().value(2).build();
        System.out.println(bfs.search(node));
        System.out.println(bfs.search(node));
        System.out.println(bfs.search(node));
    }
}
