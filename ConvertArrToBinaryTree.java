Сlass ConvertArrToBinaryTree{
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
    }
}
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // находим середину, чтобы дерево было сбалансированным
        int mid = left + (right - left) / 2;
        // создаём узел из среднего элемента
        TreeNode root = new TreeNode(nums[mid]);
        // рекурсивно строим левую и правую части
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }
}

}
