import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphCycle_bfs_Queue {

    public static boolean bfs(ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[adj.size()];

        for(int i=0;i<visited.length;i++) {
            visited[i]=false;
        }

        for(int i=0;i<visited.length;i++) {
            if(visited[i]==false) {
                if(bfsIte(adj, visited, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean bfsIte(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s) {

        visited[s] = true;

        // create a queue
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{s, -1});

        while(!q.isEmpty())
        {
            int[] pair = q.poll();
            int node = pair[0];
            int parent = pair[1];

            for(int u: adj.get(s)) {
                if(visited[u]==false) {
                    visited[u]=true;
                    q.offer(new int[]{u,s});
                }
                else if(u!=parent) {
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

        boolean result = bfs(adj);

        System.out.println(result);


    }
}
