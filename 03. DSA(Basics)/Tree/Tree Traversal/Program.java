import java.util.LinkedList;
import java.util.Queue;

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

    // Preorder tree traversal
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Tree Traversal
    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Height of the Binary Tree

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    public static void printKthLevel(Node root, int k, int level) {
        if (root != null) {

            if (level == k) {
                System.out.print(root.key + " ");
            }
            printKthLevel(root.left, k, level + 1);
            printKthLevel(root.right, k, level + 1);
        }
    }

    public static void printKthLevel(Node root, int k) {
        if (root == null)
            return;

        // if k is zero which means we are at k distance away from root.
        if (k == 0) {
            System.out.print(root.key + " ");
        }
        printKthLevel(root.left, k - 1);
        printKthLevel(root.right, k - 1);
    }

    // Level Order Traversal Brute Force Method
    public static void levelOrderTraversal(Node root) {
        // height is used to know how many levels are there in the Tree.
        int height = heightOfTree(root);

        // We can print each level by using printKthLevel function.
        for (int i = 0; i < height; i++) {
            printKthLevel(root, i);
        }
    }

    // Level Order Traversal
    public static void printLevel(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node current = q.poll();
            System.out.print(current.key + " ");
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }

    public static void printLevelLineByLine(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            Node curr = q.poll();

            if (curr == null) {
                System.out.println();
                q.add(null);
            }

            else {
                System.out.print(curr.key + " ");

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    public static void printLevelLineByLine2(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (queue.isEmpty() != true) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node curr = queue.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            System.out.println();
        }
    }

    // Size non recursive algorithm
    public static int treeSize(Node root) {
        int count = 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node curr = q.poll();
            count++;

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }

        return count;
    }

    // Size of tree recursive method
    public static int treeSizeR(Node root) {
        if (root != null) {
            return 1 + treeSizeR(root.left) + treeSizeR(root.right);
        }
        return 0;
    }

    //Maximum of Tree recursive method
    public static int maxTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        
        return Math.max(root.key, Math.max(maxTree(root.left), maxTree(root.right)));
    }

    public static int maxTreeLevel(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<Node>();
        int max = root.key;
        q.add(root);
        while(q.isEmpty() == false){
            Node cur = q.poll();
            if(cur.key > max)
                max = cur.key;

            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }

        return max;
    }

    public static void main(String args[]) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // Tree
        //    10
        //   /  \
        //  20  30
        // / \  / \
        // 40 50 60 70

        // Inorder: 40 20 50 10 60 30 70
        // Preorder: 10 20 30 40 50 60 70
        // Postorder: 40 50 20 60 70 30 10

        System.out.print("Inorder Tree Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder Tree Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder Tree Traversal: ");
        postorder(root);
        System.out.println();

        System.out.println("Height of the SubTree: " + heightOfTree(root));

        System.out.print("Kth level Traversal: ");
        printKthLevel(root, 2);
        System.out.println();

        System.out.println("Level order traversal: ");
        levelOrderTraversal(root);
        System.out.println();

        System.out.println("Level order traversal Using Queue: ");
        printLevel(root);
        System.out.println();

        System.out.println("Level order traversal Line by Line");
        printLevelLineByLine(root);
        System.out.println();

        System.out.println("Level order traversal Line by Line2: ");
        printLevelLineByLine2(root);

        System.out.println("Size of the Tree is: " + treeSize(root));

        System.out.println("Size of the Tree is: " + treeSizeR(root));


        System.out.println("Maximum of the Tree is: " + maxTree(root));
        System.out.println("Maximum of the Tree using Level Order is: " + maxTreeLevel(root));
    }

}