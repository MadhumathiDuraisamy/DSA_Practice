package test;
import java.util.*;

public class Question4 {
    static class Edge {
        char vertex, parent;
        int weight;
        Edge(char v, char p, int w) {
            vertex = v;
            parent = p;
            weight = w;
        }
    }

    public static void main(String[] args) {
        // Test Case 1 – Fully Connected Network
        System.out.println("Test Case 1 – Fully Connected Network");
        runTest1();

        System.out.println();

        // Test Case 2 – Disconnected Network
        System.out.println("Test Case 2 – Disconnected Network");
        runTest2();
    }

    static void runTest1() {
        int V = 4;
        Map<Character, List<Edge>> graph = new HashMap<>();
        for (char c = 'A'; c < 'A' + V; c++) {
            graph.put(c, new ArrayList<>());
        }

        addEdge(graph, 'A', 'B', 1);
        addEdge(graph, 'A', 'C', 2);
        addEdge(graph, 'B', 'C', 2);
        addEdge(graph, 'C', 'D', 3);

        primForAllComponents(graph);
    }

    static void runTest2() {
        char[] nodes = {'P', 'Q', 'R', 'S', 'T', 'U'};
        Map<Character, List<Edge>> graph = new HashMap<>();
        for (char c : nodes) {
            graph.put(c, new ArrayList<>());
        }

        addEdge(graph, 'P', 'Q', 4);
        addEdge(graph, 'Q', 'R', 1);
        addEdge(graph, 'S', 'T', 3);
        addEdge(graph, 'T', 'U', 2);

        primForAllComponents(graph);
    }

    static void addEdge(Map<Character, List<Edge>> graph, char u, char v, int w) {
        graph.get(u).add(new Edge(v, u, w));
        graph.get(v).add(new Edge(u, v, w));
    }

    static void primForAllComponents(Map<Character, List<Edge>> graph) {
        Set<Character> visited = new HashSet<>();
        int componentNumber = 1;

        for (char start : graph.keySet()) {
            if (!visited.contains(start)) {
                // Run Prim’s for this component
                List<String> mstEdges = new ArrayList<>();
                int totalCost = primForComponent(graph, start, visited, mstEdges);

                System.out.println("Component " + componentNumber + ":");
                System.out.println("MST Edges: " + String.join(", ", mstEdges));
                System.out.println("Total Cost: " + totalCost);
                componentNumber++;
            }
        }
    }

    static int primForComponent(Map<Character, List<Edge>> graph, char start,
                                Set<Character> visited, List<String> mstEdges) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        pq.offer(new Edge(start, '-', 0));
        int totalCost = 0;

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
            if (visited.contains(curr.vertex)) continue;

            visited.add(curr.vertex);

            if (curr.parent != '-') {
                mstEdges.add(curr.parent + "-" + curr.vertex + "(" + curr.weight + ")");
                totalCost += curr.weight;
            }

            for (Edge neighbor : graph.get(curr.vertex)) {
                if (!visited.contains(neighbor.vertex)) {
                    pq.offer(new Edge(neighbor.vertex, curr.vertex, neighbor.weight));
                }
            }
        }
        return totalCost;
    }
}
