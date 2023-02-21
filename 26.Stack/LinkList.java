import java.util.ArrayList;

public class LinkList {
    static class Stack {
        static class node {
            int data;
            node next;

            node(int data) {
                this.data = data;
                next = null;
            }
        }

        static node head = null;

        // isEmpty
        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        // push
        public static void push(int data) {
            node newNode = new node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }

        //pop
        public static int pop() {
            if(head==null){
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }

        //peak
        public static int peak() {
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(8);
        s.push(10);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
