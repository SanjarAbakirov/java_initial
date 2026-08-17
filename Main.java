import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxWidth(TreeNode root){
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int maxWidth = 0; // adding code here

        width(!queue.isEmpty()){
            int size = queue.size(); // length of queue
            maxWidth = Math.max(maxWidth, size); // comparison

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
            }
        }
    }
}