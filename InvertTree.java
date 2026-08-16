//// 1. Определяем свой класс TreeNode
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    // Конструктор без детей
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    // Конструктор с детьми
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//// 2. Главный класс (название должно совпадать с именем файла, например Main.java)
//public class Main {
//
//    // 3. Метод инверсии (точно такой же, как у вас)
//    public static TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//
//        // Рекурсивно инвертируем левое и правое поддеревья
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//
//        // Меняем местами
//        root.left = right;
//        root.right = left;
//
//        return root;
//    }
//
//    // 4. Вспомогательный метод для печати дерева (чтобы проверить результат)
//    public static void printPreOrder(TreeNode node) {
//        if (node == null) {
//            System.out.print("null ");
//            return;
//        }
//        System.out.print(node.val + " ");
//        printPreOrder(node.left);
//        printPreOrder(node.right);
//    }
//
//    // 5. Точка входа — метод main
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5,
//                new TreeNode(3,
//                        new TreeNode(16),
//                        new TreeNode(8)),
//                new TreeNode(2,
//                        new TreeNode(20),
//                        null));
//
//        System.out.print("Исходное дерево (pre-order): ");
//        printPreOrder(root);
//        System.out.println();
//
//        // Инвертируем
//        TreeNode inverted = invertTree(root);
//
//        System.out.print("Инвертированное дерево (pre-order): ");
//        printPreOrder(inverted);
//        System.out.println();
//    }
//}