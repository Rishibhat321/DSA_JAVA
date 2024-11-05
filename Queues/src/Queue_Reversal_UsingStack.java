import java.util.Stack;
import java.util.*;
import java.util.LinkedList;

public class Queue_Reversal_UsingStack {
    public static Queue<Integer> rev(Queue<Integer> q){

        // Reversing Queue using Stack

        Stack<Integer> s = new Stack<Integer>();

        if(q.isEmpty())
        {
            return q;
        }

        while(!q.isEmpty())
        {
            s.push(q.poll());
        }

        while(!s.isEmpty())
        {
            q.offer(s.pop());
        }

        return q;

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(4);
        q.offer(3);
        q.offer(1);
        q.offer(10);
        q.offer(2);
        q.offer(6);

        Queue<Integer> res = rev(q);

     //   System.out.println(res);

        while(!res.isEmpty())
        {
            System.out.print(q.poll() + " ");
        }


    }
}
