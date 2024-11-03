import java.util.*;
import java.util.Stack;

public class Next_Greater_Element {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        list.add(-1);
        int n = arr.length;

        stack.push(arr[n-1]);

        for(int i=n-2;i>=0;i--)
        {
            while((!stack.isEmpty()) && arr[i]>=stack.peek())
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                list.add(-1);
            }
            else{
                list.add(stack.peek());
            }

            stack.push(arr[i]);
        }

        Collections.reverse(list);

        return list;

    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};

        ArrayList<Integer> res = nextLargerElement(arr);

        System.out.println(res);

    }
}
