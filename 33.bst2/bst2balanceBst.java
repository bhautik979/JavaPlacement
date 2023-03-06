import java.util.*;
public class bst2balanceBst {
    static class node{
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }


    public static void getInorder(node root,ArrayList<Integer>inorder) {
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static node balanceBST(node root) {
        //1...inorder calculation
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        //2...convert to balanced tree
        return createbst(inorder,0,inorder.size()-1);
    }
    public static node createbst(ArrayList<Integer> inorder,int start,int end) {
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        node root=new node(inorder.get(mid));
        root.left=createbst(inorder, start, mid-1);
        root.right=createbst(inorder, mid+1, end);
        return root;
    }
    public static void preorder(node root) {
    
        if(root==null){return;}
           System.out.print(root.data+" ");
           preorder(root.left);
           preorder(root.right);
       }
    public static void main(String[] args) {
        node root=new node(8);
        root.left=new node(6);
        root.left.left=new node(5);
        root.left.left.left=new node(3);

        root.right=new node(10);
        root.right.right=new node(11);
        root.right.right.right=new node(12);


        preorder(root);
        System.out.println();
        root=balanceBST(root);
        preorder(root);
    }
}
