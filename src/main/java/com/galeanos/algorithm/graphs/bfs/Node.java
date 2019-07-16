package com.galeanos.algorithm.graphs.bfs;

import lombok.Builder;

import java.util.Objects;

@Builder
public class Node {
    private boolean visited;

    private int value;

    public boolean isVisited() {
        return visited;
    }

    public void unvisit() {
        this.visited = false;
    }

    public void visit() {
        this.visited = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "visited=" + visited +
                ", value=" + value +
                '}';
    }
}
