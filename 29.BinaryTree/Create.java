import java.util.*;

public class Create {
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

        public void preorder(Node root) { // o(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) { // o(n)
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) { // o(n)
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public int findHeight(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(findHeight(root.left), findHeight(root.right));
        }

        public int calculateNode(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + calculateNode(root.left) + calculateNode(root.right);
        }

        public int calculateSum(Node root) {
            if (root == null) {
                return 0;
            }
            return root.data + calculateSum(root.left) + calculateSum(root.right);
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.createBinaryTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrder(root);

        System.out.println(tree.findHeight(root));
        System.out.println(tree.calculateNode(root));
        System.out.println(tree.calculateSum(root));

    }
}
