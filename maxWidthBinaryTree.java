import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
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

// Вспомогательный класс для хранения узла и его индекса
class Pair {
    TreeNode node;
    int index;
    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

public class Main {
    public int maxWidth(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int firstIndex = queue.peek().index;   // индекс первого узла на уровне
            int lastIndex = firstIndex;            // временно

            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                TreeNode node = p.node;
                int idx = p.index;
                lastIndex = idx;   // после цикла останется индекс последнего узла

                if (node.left != null) {
                    queue.offer(new Pair(node.left, 2 * idx + 1));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, 2 * idx + 2));
                }
            }

            int width = lastIndex - firstIndex + 1;
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        // Дерево:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Main sol = new Main();
        System.out.println("Классическая максимальная ширина (с учётом null): " + sol.maxWidth(root));
        // Ожидаемый вывод: 4 (уровень 2: индексы 3,4,5,6 → ширина 4)
        // Для проверки: на уровне 2 есть узлы 4(индекс 3), 5(4), 6(6) – между 5 и 6 пропущен индекс 5 (null), поэтому ширина = 6-3+1 = 4
    }
}