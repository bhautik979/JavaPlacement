public class LinkList {
    public static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //insert to head
    //insert to tail
    //insert between
    //delete head
    //delete tail
    //delete between
    public static node head;
    public static node tail;
    public static void main(String[] args) {
        LinkList ll=new LinkList();
    }
}
