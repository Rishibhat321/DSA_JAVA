import java.util.*;
import java.util.Stack;
import java.util.LinkedList;

public class Reverse_First_K_elements_of_Queue {

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> s = new Stack<Integer>();

        if(q.isEmpty() || q.size()<k)
        {
            return q;
        }

        for(int i=0;i<k;i++)
        {
            s.push(q.poll());
        }

        while(!s.isEmpty())
        {
            q.offer(s.pop());
        }

        for(int i=0;i<q.size()-k;i++)
        {
            q.offer(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        int k=3;

        Queue<Integer> res = modifyQueue(q,k);

       // System.out.println(res);

        while(!res.isEmpty())
        {
            System.out.print(res.poll() + " ");
        }


    }
}
