class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
    }
}
public class Traversal{
    // Traversal Techniques:
    // 1. Preorder: Root,Left,Right
    // 2. Inorder: Left,Root,Right
    // 3. Postorder: Left,Right,Root

    // TC: O(N)
    // SC: O(1)
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.val+" ");
            inorder(root.right);
        }
    }

    // TC: O(N)
    // SC: O(1)
    public void preorder(Node root){
        if(root!=null){
            System.out.println(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // TC: O(N)
    // SC: O(1)
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.val+" ");
        }
    }

    // TC:O(N)
    // SC:O(1)
    public void levelorder(Node root){
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.val+" ");
            if(temp.left!=null)
                queue.offer(temp.left);
            if(temp.right!=null)
                queue.offer(temp.right);
        }
    }

    public static void main(String[] args){

    }
}