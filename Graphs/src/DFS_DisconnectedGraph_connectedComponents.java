import java.util.ArrayList;

public class DFS_DisconnectedGraph_connectedComponents {

    public static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s) {

        visited[s] = true;

        for(int u: adj.get(s))
        {
            if(visited[u]==false) {
                dfsRec(adj, visited, u);
            }
        }
    }

    public static int dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {

        int l = adj.size();
        boolean[] visited = new boolean[l];

        int count = 0;

        for(int i=0;i<adj.size();i++) {
            if(visited[i]==false) {
                dfsRec(adj, visited, i);
                count++;
            }
        }

        return count;
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

        int res = dfsOfGraph(adj);

        System.out.println("Number of connected components in an undirected graph are: " + res);
    }
}
