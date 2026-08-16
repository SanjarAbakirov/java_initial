import java.util.*;

// 1. Определяем свой класс TreeNode
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Конструктор без детей
    TreeNode(int val) {
        this.val = val;
    }

    // Конструктор с детьми
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// 2. Главный класс
public class Main {
    // 3. Метод составления этажей и направлений
    public List<List<Integer>> zigzag(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true; // flag if the direction

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(); // 1st floor
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val); // adding value
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            if (!leftToRight) {
                Collections.reverse(currentLevel);
            }

            result.add(currentLevel); //sending the floor
            leftToRight = !leftToRight; // switch to another direction
        }
        return result;
    }

    // 4. Вспомогательный метод для печати дерева (чтобы проверить результат)
    public static void printPreOrder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    // 5. Точка входа — метод main
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(16),
                        new TreeNode(8)),
                new TreeNode(2,
                        new TreeNode(20),
                        null));

        System.out.print("Дерево (pre-order): ");
        printPreOrder(root);
        System.out.println();

        // Создаём экземпляр класса Main и вызываем zigzag
        Main main = new Main();
        List<List<Integer>> zigzagResult = main.zigzag(root);

        // Выводим результат зигзага
        System.out.println("Зигзагообразный обход по уровням:");
        for (List<Integer> level : zigzagResult) {
            System.out.println(level);
        }
    }
}