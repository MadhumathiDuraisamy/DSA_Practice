package test;
import java.util.*;
class Graph{
	Map<Character,List<Character>> adj=new HashMap<>();
	public void addedge(char u,char v) {
		if(!adj.containsKey(u)) {
			adj.put(u,new ArrayList<>());
		}
		adj.get(u).add(v);
		if(!adj.containsKey(v)) {
			adj.put(v,new ArrayList<>());
		}
		adj.get(v).add(u);
	}
	public void bfs(char v) {
		Queue<Character> q=new LinkedList<>();
		HashSet<Character> visited=new HashSet<>();
		q.add(v);
		visited.add(v);
		while(!q.isEmpty()) {
			char ch=q.remove();
			System.out.print(ch+" ");
			for(char c:adj.get(ch)) {
				if(!visited.contains(c)) {
					q.add(c);
					visited.add(c);
				}
			}
		}
	}
}
public class Question3 {
	public static void main(String[] args) {
		Graph g=new Graph();
		g.addedge('P', 'Q');
		g.addedge('P', 'R');
		g.addedge('Q', 'S');
		g.addedge('R', 'T');
		g.addedge('T', 'U');
		g.bfs('P');
	}
}
