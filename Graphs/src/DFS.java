import java.util.ArrayList;

public class DFS {
    public static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited,
                              ArrayList<Integer> list, int s) {

        visited[s] = true;
        list.add(s);

        for(int u: adj.get(s))
        {
            if(visited[u]==false) {
                dfsRec(adj, visited, list, u);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int l = adj.size();
        boolean[] visited = new boolean[l];

        dfsRec(adj, visited, list, 0);

        return list;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<5;i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(0);
        adj.get(4).add(2);

        ArrayList<Integer> res = dfsOfGraph(adj);

        System.out.println(res);

    }
}
