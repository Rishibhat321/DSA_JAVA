import java.util.Stack;

class Geeks
{
    //Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
    }

    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }

        st.pop();
    }

    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        if(st.isEmpty()) {
            return;
        }

        System.out.println(st.peek());
    }

    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        if(st.isEmpty()) {
            return false;
        }

        Stack<Integer> stack = new Stack<Integer>();

        while(!st.isEmpty()) {
            int res = st.pop();
            stack.push(res);

            if(val==res) {

                while(!stack.isEmpty()) {
                    st.push(stack.pop());
                }

                return true;
            }
        }


        while(!stack.isEmpty()) {
            st.push(stack.pop());
        }

        return false;

    }
}

public class Operations_on_Stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>();

        // no need to create object. use the static access modifier in the class(here Geeks) methods

        Geeks.insert(st,5);
        Geeks.insert(st,3);
        Geeks.insert(st,4);
        Geeks.insert(st,8);
        System.out.println(Geeks.find(st,3));
        Geeks.remove(st);
        Geeks.headOf_Stack(st);




    }
}
