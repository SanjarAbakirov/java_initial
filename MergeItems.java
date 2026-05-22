import java.util.*;

public class MergeItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
                Map<Integer, Integer> map = new HashMap<>();

                for (int[] item : items1){
                    map.put(item[0], item[1]);
                }
                for (int[] item : items2){
                    map.merge(item[0], item[1], Integer :: sum);
                }

                List<List<Integer>> result = new ArrayList<>();
                for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                    result.add(List.of(entry.getKey(), entry.getValue()));
                }
                result.sort(Comparator.comparing(list -> list.get(0)));

                return result;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeItems mergeItems = new MergeItems();

        // Ввод первого массива
        System.out.println("Введите количество элементов в первом массиве:");
        int n1 = scanner.nextInt();
        int[][] items1 = new int[n1][2];
        System.out.println("Введите пары (значение, вес):");
        for (int i = 0; i < n1; i++) {
            items1[i][0] = scanner.nextInt();
            items1[i][1] = scanner.nextInt();
        }

        // Ввод второго массива
        System.out.println("Введите количество элементов во втором массиве:");
        int n2 = scanner.nextInt();
        int[][] items2 = new int[n2][2];
        System.out.println("Введите пары (значение, вес):");
        for (int i = 0; i < n2; i++) {
            items2[i][0] = scanner.nextInt();
            items2[i][1] = scanner.nextInt();
        }

        // Вызов метода и вывод результата
        List<List<Integer>> result = mergeItems.mergeSimilarItems(items1, items2);
        System.out.println("\nРезультат объединения:");
        for (List<Integer> item : result) {
            System.out.println("[" + item.get(0) + ", " + item.get(1) + "]");
        }
        scanner.close();
    }

}
