import java.util.Stack;

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
   public void Push(int x)
    {
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
   public int Pop()
    {

        if(s1.isEmpty())
        {
            return -1;
        }

        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        int res = s2.pop();

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

        return res;
    }
}

public class Queue_using2_stacks {
    public static void main(String[] args) {

        StackQueue obj = new StackQueue();
        obj.Push(2);
        System.out.println(obj.Pop());
        System.out.println(obj.Pop());

    }
}
