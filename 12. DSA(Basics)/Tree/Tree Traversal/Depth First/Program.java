// Depth First Tree Traversal has 3! types and 3 most popular are:
// 1. Inorder
// 2. Preorder
// 3. Postorder

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }
}

public class Program {

    // Inorder Tree Traversal
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    //Preorder tree traversal
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    //Postorder Tree Traversal    
    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String args[]) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.right.left = new Node(40);
        root.right.right = new Node(50);

        // Tree 
        //     10
        //    /  \
        //   20  30
        //       /\
        //      40 50

        // Inorder: 20 10 40 30 50
        // Preorder: 10 20 30 40 50
        // Postorder: 20 40 50 30 10

        System.out.println("Inorder Tree Traversal");
        inorder(root);
        System.out.println();

        System.out.println("Preorder Tree Traversal");
        preorder(root);
        System.out.println();

        System.out.println("Postorder Tree Traversal");
        postorder(root);
        System.out.println();
    }
}