class LinkList {
    public static node head=null;
    public static node tail=null;
    public static int size;
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        // insert to head

        public static void insertFirst(int data) {

            node newNode = new node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
            }
    
            else {
                newNode.next = head;
                head = newNode;
            }
            return;
        }
    
        // insert to tail
    
        public void insertLast(int data) {
            node newNode = new node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public static boolean isCycle()
        {
            node slow=head;
            node fast=head;
            while (fast!=null && fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }

        public static void removeCycle() {
            //1 check cycle
            boolean flag=isCycle();
            node slow=head;
            node fast=head;
            while (fast!=null && fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast){
                    flag=true;
                    break;
                }
            }
            if(flag==false){return;}
            //2. 
            slow=head;
            node prev=null;
            if(flag==true){
                while(slow!=fast){
                    prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                }
                prev.next=null;
            }
        }
        public static void ptintLL() {
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
            //1-2-3-1
            head=new node(1);
            head.next=new node(2);
            head.next.next=new node(3);
            head.next.next=head;
            System.out.println(isCycle());
            removeCycle();
            ptintLL();

        }
}
