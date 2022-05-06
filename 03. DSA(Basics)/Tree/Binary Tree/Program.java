class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
    }
}
public class Program{
    public static void inorderTraversal(Node root){
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.key + " ");
        inorderTraversal(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);

        // System.out.print(root.key + " ");
        // System.out.print(root.left.key + " ");
        // System.out.print(root.right.key + " ");
        // System.out.print(root.left.left.key + "\n");
        inorderTraversal(root);
        System.out.println();
    }
}