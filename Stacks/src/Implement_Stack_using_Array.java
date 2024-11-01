class MyStack {
    private int[] arr;
    private int top;
    private int size;

    public MyStack() {
        arr = new int[1000];
        top = -1;
        size=0;
    }

    public void push(int x) {

        if(top==arr.length-1) {
            return;
        }

        top++;
        arr[top] = x;
        size++;

    }

    public int pop() {

        if(top==-1) {
            return -1;
        }

        int res = arr[top];
        top--;
        size--;

        return res;

    }

    public int size() {
        return size;
    }

    public int peek() {
        if(top==-1) {
            return (Integer.MAX_VALUE);
        }

        return (arr[top]);
    }

    public boolean isEmpty() {

        if(top==-1) {
            return true;
        }

        return false;
    }
}

public class Implement_Stack_using_Array {
    public static void main(String[] args) {

        MyStack obj = new MyStack();
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        obj.push(4);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());


    }
}