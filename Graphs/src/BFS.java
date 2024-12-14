import java.util.*;
import java.util.LinkedList;
public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {


        boolean[] visited = new boolean[V+1];

        ArrayList<Integer> list = new ArrayList<Integer>();

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            int u = q.poll();
            list.add(u);

            for(int v: adj.get(u))
            {
                if(visited[v]==false) {
                    visited[v]= true;
                    q.offer(v);
                }
            }
        }

        return list;

    }

    public static void print(ArrayList<Integer> res) {

        for(int ele: res) {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

       ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
       int V = 5;
       for(int i=0;i<V;i++) {
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

       ArrayList<Integer> res = bfsOfGraph(V, adj);

     //   System.out.println(res);

        print(res);

    }
}
