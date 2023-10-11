public class PrintNodes{
    // TC: O(N)
    // SC: O(1)
    public void printGivenLevel(Node root, int level){
        if(root==null)
            return;
        if(level==1)
            System.out.println(root.val+" ");
        if(level>1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    // TC: O(N)
    // SC: O(1)
    public void printLeafNode(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            System.out.println(root.val+" ");
            return;
        }
        if(root.left!=null)
            printLeafNode(root.left);
        if(root.right!=null)
            printLeafNode(root.right);
    }

    // TC: O(N)
    // SC: O(1)
    public void printNonLeaf(Node root){
        if(root==null || (root.left==null && root.right==null))
            return;
        if(root.left!=null || root.right!=null)
            System.out.println(root.val+ " ");
        printNonLeaf(root.left);
        printNonLeaf(root.right);
    }

    public static void main(String[] args){

    }
}