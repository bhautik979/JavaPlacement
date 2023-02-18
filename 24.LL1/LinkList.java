public class LinkList {
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

    public static void insertLast(int data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    // insert between
    public static void insertBetween(int data,int index){  //index start from 0
        if(index==0){
            insertFirst(data);
            return;
        }
        node newNode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    } 

    // delete head

    public static int removeFirst(){
        int val;

        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }


        else if(size==1){
            val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        else{
            val=head.data;
            head=head.next;
            size--;
            return val;
        }
    }
    // delete tail
    public static int removeLast(){
        int val;
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }


        else if(size==1){
            val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        else{
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
                
            }
            val=temp.next.data;
            tail=temp;
            tail.next=null;
            size--;
            return val;
        }
    }

    //searc in ll
    public static void search(int key){
        node temp=head;
        while(temp!=null){
            if(temp.data==key){
              System.out.println("Yes");
            }
            temp=temp.next;
        }
        System.out.println("No");
    }

    public static int helper(node head,int key){

        if(head==null){
            return -1; 
        }
   
        if(head.data==key){
            return 0;
        }

        int midear=helper(head.next, key);
        if(midear==-1){return -1;}
        return midear+1;

    }
    //recursive search in ll
    public static int recSearch(int key){
        return helper(head,key);
    }
    // print LL
    public void printLL() {
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    //reverse LL
    public static void reverseLL() {
        node prev=null;
        node curr=tail=head;          //tail initialize because at last tail become head no index
        node next;

        while(curr!=null){
            //1
            next=curr.next;
            //2
            curr.next=prev;
            //3
            prev=curr;
            //4
            curr=next;

        }
        head=prev;  //because curr to null thai gyo hoy
        
    }

    //remove nth element from last
    public static void removeNth(int n) {

        int sz=0;  //calculate size
        node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }

        temp=head;
        int iTOfind=sz-n;   //nth from last is (size-n+1) from first so go to sz-n and make node->next->next
        int i=1;   //denote first node
        while (i<iTOfind) {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        
    } 

    //Find Middle element
    public static node findMid() {
        node slow=head;
        node fast=head;
        while (fast.next!=null && fast!=null  ) {
            slow=slow.next;   //+1
            fast=fast.next.next;   //+2
        }

        return slow;
    }

    public static int findPalindrome() {
        //1 fing min
        node mid=findMid();

        //2 reverse half ll
        node prev=null;
        node curr=mid;
        node next;
        while (curr!=null) {
            next=curr;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //3 check half equal
        node leftTemp=head;
        node rightTemp=tail;
        while (rightTemp!=null) {
            if(leftTemp.data!=rightTemp.data){
                return -1;
            }
            rightTemp=rightTemp.next;
            leftTemp=leftTemp.next;
        }
        return 1;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(40);
        ll.insertBetween(50, 3);
        ll.insertBetween(60, 3);
        // System.out.println(ll.size);
        // ll.printLL();

        // ll.removeFirst();
        // System.out.println(ll.size);
        // ll.printLL();

        // ll.removeLast();
        // System.out.println(ll.size);
        //ll.reverseLL();

        // ll.printLL();
        // System.out.println();
        // ll.removeNth(3);
        // ll.printLL();

       //System.out.println(recSearch(20));



       LinkList ll2=new LinkList();
       ll2.insertLast(1);
       ll2.insertLast(2);
       ll2.insertLast(2);
       ll2.insertLast(1);
       System.out.println(ll2.findPalindrome());
    }
}
