class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
    }
}
public class BinaryTree{

    // TC: O(N)
    // SC: O(1)
    public Node insert(Node root,int value){
        if(root==null)
            return new Node(value);
        if(value<root.val){
            root.left = insert(root.left,value);
        }
        else if(value>root.val){
            root.right = insert(root.right,value);
        }
        return root;
    }

    // TC: O(logN)
    // SC: O(1)
    public Node delete(Node root, int val){
        if(root==null)
            return root;
        if(root.val>val)
            root.left = delete(root.left,val);
        else if(root.val<val)
            root.right = delete(root.right,val);
        else{
            if(root.left==null){
                Node temp = root.right;
                return temp;
            }
            else if(root.right==null){
                Node temp = root.left;
                return temp;
            }
            Node temp = inorder_succ(root.left);
            root.val = temp.val;
            root.left = delete(root.left,root.val);
        }
        return root;
    }

    // TC:O(N)
    // SC:O(1)
    public Node inorder_succ(Node root){
        Node temp = root;
        while(temp!=null && temp.right!=null)
            temp = temp.right;
        return temp;
    }

    // TC: O(logN)
    // SC: O(1)
    public boolean search(Node root, int value){
        if(root!=null){
            if(value<root.val)
                return search(root.left,value);
            if(value>root.val)
                return search(root.right,value);
            if(root.val==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args){

    }
}