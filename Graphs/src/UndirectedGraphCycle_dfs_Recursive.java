import java.util.ArrayList;

public class UndirectedGraphCycle_dfs_Recursive {

    public static boolean dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, int parent) {

        visited[s] = true;

        for(int u: adj.get(s)) {
            if(visited[u]==false) {
                if(dfsRec(adj, visited, u, s)==true) {
                    return true;
                }
            }
            else if(u!=parent) {
                return true;
            }
        }

        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[adj.size()];

        for(int i=0;i<visited.length;i++) {
            visited[i]=false;
        }

        for(int i=0;i<visited.length;i++) {

            if(visited[i]==false) {
                if(dfsRec(adj, visited, i, -1)==true) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<6;i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(3).add(2);
        adj.get(4).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);

        boolean result = dfs(adj);

        System.out.println(result);
        
    }
}
