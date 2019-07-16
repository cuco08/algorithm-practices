package com.galeanos.algorithm.graphs.bfs;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    private Map<Node, Set<Node>> adjacent;

    public Graph() {
        adjacent = new HashMap<>();
    }

    public void addEdge(Node fromNode, Node toNode) {
        if (!adjacent.containsKey(fromNode)) {
            adjacent.put(fromNode, new HashSet<>());
        }
        if (!adjacent.containsKey(toNode)) {
            adjacent.put(toNode, new HashSet<>());
        }
        adjacent.keySet()
                .stream()
                .filter(n -> n.equals(toNode))
                .findFirst()
                .ifPresent(n -> adjacent.get(fromNode).add(n));
    }

    public Map<Node, Set<Node>> getAdjacent() {
        return  adjacent;
    }

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        adjacent.entrySet().stream().forEach(entry -> {
            buffer
                .append("(")
                .append(entry.getKey())
                .append(") -> ")
                .append(entry.getValue())
                .append("\n");
        });
        return buffer.toString();
    }
}
