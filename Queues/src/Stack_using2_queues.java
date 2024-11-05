
import java.util.LinkedList;
import java.util.*;

class Queues
{
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Queues() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    //Function to push an element into stack using two queues.
   public void push(int a)
    {
        q1.offer(a);
    }

    //Function to pop an element from stack using two queues.
   public  int pop()
    {
        if(q1.isEmpty()) {
            return -1;
        }

        while(q1.size()!=1) {
            q2.offer(q1.poll());
        }

        int res = q1.poll();

        while(!q2.isEmpty())
        {
            q1.offer(q2.poll());
        }

        return res;
    }

}

public class Stack_using2_queues {
    public static void main(String[] args) {
        Queues obj = new Queues();
        obj.push(3);
        obj.push(2);
        System.out.println(obj.pop());
        obj.push(4);
        System.out.println(obj.pop());

    }
}