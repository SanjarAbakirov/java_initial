import javax.swing.tree.TreeNode;

class TreeNode {
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

// built-in class
public class Main {
    public static TreeNode invertTree(TreeNode root){
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void printPreOrder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args) {
        // Создаём исходное дерево
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3),
                        new TreeNode(7)),
                new TreeNode(15,
                        null,
                        new TreeNode(20)));

        System.out.print("Исходное дерево (pre-order): ");
        printPreOrder(root);
        System.out.println();

        // Инвертируем
        TreeNode invertedRoot = invertTree(root);

        System.out.print("Инвертированное дерево (pre-order): ");
        printPreOrder(invertedRoot);
        System.out.println();
    }
}