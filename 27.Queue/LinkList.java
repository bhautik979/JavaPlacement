public class LinkList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static node head = null;
        static node tail = null;

        public static boolean isEmpty() {
            if (head == null && tail == null) {
                return true;
            }
            return false;
        }

        public static void add(int data) {
            node newNode =new node(data);
            if(tail==null){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            
        }

        public static int remove() {
            int value;
            value=head.data;
            if(isEmpty()){
                return -1;
            }
            if(head==tail){
              tail=head=null;
            }
            else{
                head=head.next;
            }
            return value;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
