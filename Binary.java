import javax.swing.tree.TreeNode;

// built-in class
public class Binary{
    int val; // node value
    TreeNode left; // value of the left part
    TreeNode right; // value of the right part

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public static TreeNode invertTree(TreeNode root){
    if(root == null){
        return null;
    }

    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.left = right;
    root.right = left;

    return root;
}