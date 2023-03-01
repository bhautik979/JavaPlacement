import java.util.*;
public class DiamenerTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node createBinaryTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;

            }
            Node newNode = new Node(node[idx]);
            newNode.left = createBinaryTree(node);
            newNode.right = createBinaryTree(node);
            return newNode;
        }

        public static  int findHeight(Node root) {
            if(root==null){
                return 0;
            }
            return 1+Math.max(findHeight(root.left),findHeight(root.right));
        }

        // public static int Diamener(Node root) {   //O(N^2)     //1 node ni height find karva o(n) eva n node ni karvani
        //     if(root==null){
        //         return 0;
        //     }

        //     int ldiameter=Diamener(root.left);
        //     int rdiameter=Diamener(root.right);
        //     int lheight=findHeight(root.left);
        //     int rheight=findHeight(root.right);


        //     return Math.max(Math.max(ldiameter,rdiameter),(lheight+rheight+1));            //secong aargument denote pass by root node,,first denote not pass by root
            
        // }


        static class Info{
            int diam;
            int height;
        }
        public static Info calculateDiam (Node root) {
            Info i=new Info();
            if(root==null){
                i.diam=0;
                i.height=0;
            }
            else{
                Info leftInfo=calculateDiam(root.left);
                Info rightInfo=calculateDiam(root.right);

                i.diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),(leftInfo.height+rightInfo.height+1));
                i.height=Math.max(leftInfo.height,rightInfo.height)+1;
            }
            return i;
        }
        public static int Diameter(Node root) {   //O(N^2)     //1 node ni height find karva o(n) eva n node ni karvani
        
            Info i=calculateDiam(root);
            return i.diam;
        }

    }



    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.createBinaryTree(nodes);

       System.out.println( tree.Diameter(root));

    }
}
