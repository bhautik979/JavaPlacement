import java.util.*;
class creation {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static node insert(node root,int data){
          if(root==null){
            root=new node(data);
            return root;
          }
          else if(data>root.data){
            root.right=insert(root.right,data);
          }
          else{
            root.left=insert(root.left, data);
          }
          return root;
    }

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right, key);
        }

    }

    public static node delete(node root,int key){
        if(root.data<key){
            root.right=delete(root.right,key);
        }
        else if(root.data>key){  
            root.left=delete(root.left,key);
        }
        else{     //data are equal

            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                node IS=findInorderSucsessor(root.right);   //inorder sucsessor
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
            
        }
        return root;
    }

    public static node findInorderSucsessor(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void findRange(node root,int start,int end){
        if(root==null){
            return;
        }
        if(root.data>=start && root.data<=end){
            findRange(root.left, start, end);
            System.out.print(root.data+" ");
            findRange(root.right, start, end);
            return;
        }
        else if(root.data<start){
            findRange(root.right, start, end);
            return;
        }
        else{

            findRange(root.left, start, end);
            return;
        }
    }

    public static void printPath(ArrayList <Integer>path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");

        }
        System.out.println();
    }
    public static void root2leaf(node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
         path.add(root.data);
         if(root.left==null && root.right==null){
            printPath(path);
         }
         root2leaf(root.left, path);
         root2leaf(root.right, path);
         path.remove(path.size()-1);


    }

   public static boolean isValid(node root,node min,node max) {
    
       if(root==null){
        return true;
       }
       else if(min!=null && root.data<=min.data){
        return false;
       }
       else if(max!=null && root.data>=max.data){
        return false;
       }

       return isValid(root.left, min, root) && isValid(root.right, root, max);
   }

   public static node mirror(node root) {

      if(root==null){return null;}
      node lst=mirror(root.left);
      node rst=mirror(root.right);
      root.left=rst;
      root.right=lst;

      return root;

   }

   public static void preorder(node root) {
    
    if(root==null){return;}
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
   }
    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14 };
        node root=null;

        
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        // inorder(root);  
        /*if(search(root,3)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }*/

        /*delete(root, 8);*/
        // findRange(root, 5, 11);
        // inorder(root);
        
        // root2leaf(root, new ArrayList<Integer>());
        // System.out.print(isValid(root, null, null));
        preorder(root);
        node newroot=mirror(root);
        System.out.println();
        preorder(newroot);
    }
}