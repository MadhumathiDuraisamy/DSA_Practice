package test;
import java.util.*;
public class Question5 {
	static class Edge implements Comparable<Edge> {
        char u, v;
        int cost;
        Edge(char u, char v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
        public int compareTo(Edge other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    static class UnionFind {
        Map<Character, Character> parent = new HashMap<>();

        public void makeSet(List<Character> cities) {
            for (char city : cities) {
                parent.put(city, city);
            }
        }

        public char find(char city) {
            if (parent.get(city) != city) {
                parent.put(city, find(parent.get(city))); // path compression
            }
            return parent.get(city);
        }

        public boolean union(char a, char b) {
            char rootA = find(a);
            char rootB = find(b);
            if (rootA == rootB) return false;
            parent.put(rootB, rootA);
            return true;
        }
    }

    public static void kruskalMST(List<Character> cities, List<Edge> edges) {
        Collections.sort(edges); // sort by cost
        UnionFind uf = new UnionFind();
        uf.makeSet(cities);

        List<Edge> mstEdges = new ArrayList<>();
        int totalCost = 0;

        for (Edge e : edges) {
            if (uf.union(e.u, e.v)) {
                mstEdges.add(e);
                totalCost += e.cost;
            }
        }
        for (Edge e : mstEdges) {
            System.out.println(e.u + "-" + e.v + "->" + e.cost);
        }
        System.out.println("Total Minimum Cost = " + totalCost);
    }

    public static void main(String[] args) {
        List<Character> cities1 = Arrays.asList('A', 'B', 'C', 'D');
        List<Edge> edges1 = Arrays.asList(
                new Edge('A', 'B', 1),
                new Edge('A', 'C', 3),
                new Edge('B', 'C', 2),
                new Edge('B', 'D', 4),
                new Edge('C', 'D', 5)
        );
        kruskalMST(cities1, edges1);
    }
}
