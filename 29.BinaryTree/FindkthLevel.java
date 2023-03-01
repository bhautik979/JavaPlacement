public class FindkthLevel {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    public static int level = 3;

    public static void FindkthLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == level) {
            System.out.println(root.data + " ");
        }
        FindkthLevel(root.left, k + 1);
        FindkthLevel(root.right, k + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        FindkthLevel(root, 1);
    }
}
