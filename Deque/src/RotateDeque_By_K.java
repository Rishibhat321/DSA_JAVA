import java.util.*;
import java.util.ArrayDeque;

public class RotateDeque_By_K {
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        if(deque.isEmpty())
        {
            return;
        }

        if(k<=0) {
            return;
        }

        int c=1;
        while(c<=k) {
            int ele = deque.pollFirst();
            deque.offerLast(ele);
            c++;
        }

    }

    //Function to rotate deque by k places in clockwise direction.
    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {
        if (deque.isEmpty()) {
            return;
        }

        if (k <= 0) {
            return;
        }

        int c = 1;
        while (c <= k) {
            int ele = deque.pollLast();
            deque.offerFirst(ele);
            c++;
        }
    }

    public static void printElement(ArrayDeque<Integer> deque)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!deque.isEmpty())
        {
            System.out.print(deque.peekFirst() + " ");
            list.add(deque.pollFirst());
        }

        System.out.println();

        deque.addAll(list);
        list.clear();

    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);

        int k=2;
        int n = deque.size();

        left_Rotate_Deq_ByK(deque, n ,k);
        printElement(deque);

        right_Rotate_Deq_ByK(deque,n,k);
        printElement(deque);


    }
}
