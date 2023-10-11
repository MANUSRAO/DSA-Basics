// TC: O(N)
// SC: O(h)
class Tree{
    int max_level = 0;
    
    //Function to get the right view of the binary tree.
    void rightViewUtil(ArrayList<Integer> result, Node node, int level)
    {
        //if root is null, we simply return.
        if (node==null) return;
        
        //if this is the last node of its level then it is in the right view.
        if (max_level < level)
        {
            //storing data of current node in list.
            result.add(node.data);
            max_level = level;
        }
        
        // Recur for right subtree first, then left subtree
        rightViewUtil(result, node.right, level+1);
        rightViewUtil(result, node.left, level+1);
    }
    
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
		rightViewUtil(result, root, 1);
		//returning the list.
		return result;
    }
}