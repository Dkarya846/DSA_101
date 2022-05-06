import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }
}

public class ChildrenSum {
    public static boolean childSumProperty(Node root){
        if(root == null || (root.left == null && root.right == null))
            return true;

        //Checking if left child or right child is null
        // if child is null then it will be treated as 0
        int leftData = root.left == null ? 0 : root.left.key; 
        int rightData = root.right == null ? 0 : root.right.key; 

        
        
        return (leftData+rightData == root.key) && childSumProperty(root.left) && childSumProperty(root.right);
        
    }
    
    public static void main(String args[]) {

        Node root = new Node(20);

        root.left = new Node(8);
        root.right = new Node(12);

        root.left.left = new Node(3);
        root.left.right = new Node(5);

        // Tree
        //    20
        //    / \
        //   8  12
        //  / \ 
        // 3  5

        //Second Tree
        Node root2 = new Node(3);

        root2.left = new Node(2);
        root2.right = new Node(1);

        root2.left.left = new Node(2);
        root2.left.right = new Node(1);

        // Tree
        //     3
        //    / \
        //   1  2
        //     / \ 
        //    1   2


        System.out.print("Does Tree follows Child Sum Property: ");
        if(childSumProperty(root))
            System.out.println("Yes");
        else
            System.out.println("No");


        System.out.print("Does Tree2 follows Child Sum Property: ");
        if(childSumProperty(root2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
