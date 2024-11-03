import java.util.*;
import java.util.Stack;

public class Stock_Span_Problem {
    public static ArrayList<Integer> calculateSpan(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        list.add(1);
        stack.push(0);

        for(int i=1;i<arr.length;i++) {

            while((!stack.isEmpty()) && arr[i]>=arr[stack.peek()])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                list.add(i+1);
            }
            else{
                list.add(i-stack.peek());
            }

            stack.push(i);
        }


        return list;
    }

    public static void main(String[] args) {

        int[] arr = {100, 80, 60, 70, 60, 75, 85};

        ArrayList<Integer> res = calculateSpan(arr);

        System.out.println(res);

    }
}
