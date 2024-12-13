import java.util.*;

public class Print_Adjacency_List {

    public static void AddItem(List<List<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);

    }

    public static List<List<Integer>> printGraph(int V, int edges[][]) {

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }

        int e = edges.length;

        for(int i=0;i<e;i++) {

            AddItem(adj, edges[i][0], edges[i][1]);
        }

        return adj;

    }

    public static void print(List<List<Integer>> list) {
        for(int i=0;i<list.size();i++) {
            for(int j=0;j<list.get(i).size();j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int V = 5;
        int[][] edges = {{0,1},
                         {0,4},
                         {4,1},
                         {4,3},
                         {1,3},
                         {1,2},
                         {3,2}};

        List<List<Integer>> res = printGraph(V, edges);

     //   System.out.println(res);

        print(res);

    }
}