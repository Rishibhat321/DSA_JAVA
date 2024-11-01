class Node{
    Node next;
    int data;

    Node(int d) {
        this.data = d;
        this.next=null;
    }
}

class MyStack1 {
    Node head;
    int size;

    MyStack1() {
        head = null;
        size=0;
    }

    public void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head=temp;
        size++;

    }

    public int pop() {

        if(head==null) {
            return (Integer.MAX_VALUE);
        }

        int res = head.data;
        head = head.next;
        size--;

        return res;
    }

    public int size() {
        return size;
    }

    public int peek() {
        if(head==null) {
            return (Integer.MAX_VALUE);
        }

        return (head.data);
    }

    public boolean isEmpty() {
        return (head==null);
    }

}

public class Implement_Stack_Using_LinkedList {
    public static void main(String[] args) {

        MyStack1 obj = new MyStack1();
        System.out.println(obj.peek());
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        obj.push(4);
        System.out.println(obj.size());
        System.out.println(obj.pop());

    }
}
