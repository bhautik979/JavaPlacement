public class largestSize {
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
        }
    }

    static class Info{
        boolean isValid;
        int size;
        int min;
        int max;

        public Info(boolean isValid, int size, int min, int max) {
            this.isValid = isValid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxBST=0;

    public static Info largestBST(node root) {
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info left=largestBST(root.left);
        Info right=largestBST(root.right);
        int size=left.size+right.size+1;
        int min=Math.min(root.data,Math.min(left.min,right.min));
        int max=Math.max(root.data,Math.min(left.max,right.max));

        if(root.data<=left.max || root.data>=right.min){
            return new Info(false,size,min,max);
        }

        if(left.isValid && right.isValid){
            maxBST=Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);
        
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(5);
        root.left.right=new node(20);

        root.right=new node(60);
        root.right.right=new node(70);
        root.right.left=new node(45);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);


        largestBST(root);
        System.out.println("Largest size is:"+maxBST);
    }
}
