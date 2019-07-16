package com.galeanos.algorithm.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class BFS {
    private Graph graph;

    public BFS(Graph graph) {
        this.graph = graph;
    }

    public boolean search(Node node) {
        boolean found = false;

        final Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(graph.getAdjacent().keySet().stream().findFirst().get());

        short it = 0;
        while (!nodeQueue.isEmpty()) {
            final Node n = nodeQueue.poll();

            ++it;
            // System.out.println("Evaluating node : " + n);

            if (!n.isVisited()) {
                n.visit();
                if (n.equals(node)) {
                    found = true;
                    break;
                } else {
                    nodeQueue.addAll(graph.getAdjacent().get(n)
                            .stream()
                            .filter(child -> !child.isVisited() && !nodeQueue.contains(child))
                            .collect(Collectors.toList()));
                }
            }
        }
        // System.out.println("Iterations: " + it);

        resetGraph();

        return found;
    }

    public void resetGraph() {
        graph.getAdjacent().keySet().stream().forEach(keyNode -> {
            keyNode.unvisit();
            graph.getAdjacent().get(keyNode).stream().forEach(node -> node.unvisit());
        });
    }
}
