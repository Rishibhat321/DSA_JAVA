import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_disconnectedGraph_connectedComponents {

    public static int bfsDis(ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V+1];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;

        for(int i=0;i<V;i++) {
            if(visited[i]==false) {
                bfsOfGraph(adj, i , visited, list);
                count++;
            }
        }

        return count;
    }

    public static void bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited,
                                  ArrayList<Integer> list)
    {

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visited[i] = true;

        while(!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for(int v: adj.get(u))
            {
                if(visited[v]==false) {
                    visited[v]= true;
                    q.offer(v);
                }
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int V = 7;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(3).add(2);
        adj.get(4).add(5);
        adj.get(4).add(6);
        adj.get(5).add(4);
        adj.get(5).add(6);
        adj.get(6).add(4);
        adj.get(6).add(5);


        int res = bfsDis(adj, V);

        System.out.println();

        System.out.println("Number of Connected Components are: " + res);

    }
}
