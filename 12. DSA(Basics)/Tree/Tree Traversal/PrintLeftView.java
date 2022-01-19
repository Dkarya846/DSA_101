import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }
}

public class PrintLeftView {
    public static void printLeftView(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0; i < count; i++){
                Node cur = q.poll();
                if(i == 0){
                    System.out.print(cur.key + " ");
                }
                
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null)
                    q.add(cur.right);
            }
        }
    }
    public static void main(String args[]){

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        printLeftView(root);

        // Tree
        //    10
        //   /  \
        //  20  30
        // / \  / \
        // 40 50 60 70

        // Inorder: 40 20 50 10 60 30 70
        // Preorder: 10 20 30 40 50 60 70
        // Postorder: 40 50 20 60 70 30 10
    }    
}
