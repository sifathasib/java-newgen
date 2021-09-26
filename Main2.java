package com.cse708.project;

import java.util.*;

public class Main2 {
    public static List<Set<Integer>> graph;
    public static Set<Integer> cutVertices = new HashSet<>();

    public static List<Integer> discoveryTime;
    public static List<Integer> lowTime;
    public static List<Integer> parent;

    public static int time = 0;

    public static void main(String[] args) {
        scanInput();
        findCutVertices();
        printOutput();
    }

    public static void scanInput() {
        Scanner scanner = new Scanner(System.in);
        int vertexCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();

        graph = new ArrayList<>(vertexCount);

        for (int node = 0; node < vertexCount; node++) {
            graph.add(node, new HashSet<>());
        }

        for (int i = 0; i < edgeCount; i++) {
            addEdge(scanner.nextInt(), scanner.nextInt());
        }
    }

    public static void addEdge(int firstNode, int secondNode) {
        graph.get(firstNode).add(secondNode);
        graph.get(secondNode).add(firstNode);
    }

    public static void findCutVertices() {
        discoveryTime = new ArrayList<>(graph.size());
        lowTime = new ArrayList<>(graph.size());

        parent = new ArrayList<>(graph.size());

        for (int i = 0; i < graph.size(); i++) {
            discoveryTime.add(i, -1);
            lowTime.add(i, -1);
            parent.add(i, -1);
        }

        for (int node = 0; node < graph.size(); node++) {
            if (undiscovered(node)) {
                dfs(node);
            }
        }
    }

    public static boolean undiscovered(int node) {
        return discoveryTime.get(node) == -1;
    }

    public static void dfs(int node) {
        discoveryTime.set(node, time);
        lowTime.set(node, time);
        time++;

        int subgraphs = 0;
        for (int neighbor : graph.get(node)) {
            if (neighbor == parent.get(node)) {
                continue;
            }

            if (undiscovered(neighbor)) {
                parent.set(neighbor, node);
                dfs(neighbor);

                lowTime.set(node, Math.min(lowTime.get(node), lowTime.get(neighbor)));
                subgraphs++;

                if (nodeIsNonRootAndNeighborHasNoBackEdgeToAncestorOfNode(node, neighbor)) {
                    cutVertices.add(node);
                }

            } else {
                lowTime.set(node, Math.min(lowTime.get(node), discoveryTime.get(neighbor)));
            }
        }

        if (nodeIsRootAndHasMultipleSubgraphs(node, subgraphs)) {
            cutVertices.add(node);
        }
    }

    public static boolean nodeIsNonRootAndNeighborHasNoBackEdgeToAncestorOfNode(int node, int neighbor) {
        return !isRoot(node) && lowTime.get(neighbor) >= discoveryTime.get(node);
    }

    public static boolean nodeIsRootAndHasMultipleSubgraphs(int node, int subgraph) {
        return isRoot(node) && subgraph > 1;
    }

    public static boolean isRoot(int node) {
        return parent.get(node) == -1;
    }

    public static void printOutput() {
        if (cutVertices.isEmpty()) {
            System.out.println("No cut vertices");
            return;
        }

        for (int node : cutVertices) {
            System.out.printf("%d ", node);
        }

        System.out.println();
    }

    /* Sample input:
Input for cut vertices:
6 6
0 1
1 2
0 2
0 3
3 4
3 5

5 5
1 0
0 2
2 1
0 3
3 4

4 3
0 1
1 2
2 3

7 8
0 1
1 2
2 0
1 3
1 4
1 6
3 5
4 5

Input for no cut vertices:
3 3
0 1
0 2
1 2
    */
}
