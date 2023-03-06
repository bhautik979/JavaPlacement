public class createbst {
    static class node{
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

  
  public static node createbst(int arr[],int start,int end) {
    if(start>end){
        return null;
    }
    
        int mid=(start+end)/2;
        node root=new node(arr[mid]);
        root.left=createbst(arr, start, mid-1);
        root.right=createbst(arr, mid+1, end);
        return root;
  }
  public static void preorder(node root) {
    
    if(root==null){return;}
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
   }

    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        node root=createbst(arr, 0, arr.length-1);
        preorder(root);


    }
}
