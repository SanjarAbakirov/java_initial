// ---------------- 136 ------------
// public class SingleNumber {
//     public int singleNumber(int[] nums) {
//         int result = 0;
//         for (int i = 0; i < nums.length; i++) {
//             result ^= nums[i];
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         SingleNumber solution = new SingleNumber();

//         // Тесты
//         int[] test1 = { 2, 2, 1 };
//         System.out.println("Test 1: " + solution.singleNumber(test1)); // 1

//         int[] test2 = { 4, 1, 2, 1, 2 };
//         System.out.println("Test 2: " + solution.singleNumber(test2)); // 4

//         int[] test3 = { 1 };
//         System.out.println("Test 3: " + solution.singleNumber(test3)); // 1

//         int[] test4 = { 7, 3, 5, 3, 7 };
//         System.out.println("Test 4: " + solution.singleNumber(test4)); // 5
//     }

// }

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    // public int singleNumber(int[] nums) {
    // int result = 0;
    // for (int num : nums) { // используем for-each для читаемости
    // result ^= num;
    // }
    // return result;
    // }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();

        System.out.println("=== Тестирование метода singleNumber ===");

        // Базовые тесты
        testCase(solver, new int[] { 2, 2, 1 }, 1, 1);
        testCase(solver, new int[] { 4, 1, 2, 1, 2 }, 4, 2);
        testCase(solver, new int[] { 1 }, 1, 3);
        testCase(solver, new int[] { 7, 3, 5, 3, 7 }, 5, 4);

        // Дополнительные тесты
        testCase(solver, new int[] { -1, -1, -2 }, -2, 5);
        testCase(solver, new int[] { 0, 1, 0 }, 1, 6);
        testCase(solver, new int[] { 1, 0, 1 }, 0, 7);
    }

    // Вспомогательный метод для тестирования
    private static void testCase(SingleNumber solver, int[] input,
            int expected, int testNumber) {
        int result = solver.singleNumber(input);
        if (result == expected) {
            System.out.printf("✓ Тест %d пройден: %d\n", testNumber, result);
        } else {
            System.out.printf("✗ Тест %d не пройден!\n", testNumber);
            System.out.printf("  Вход: %s\n", arrayToString(input));
            System.out.printf("  Ожидалось: %d\n", expected);
            System.out.printf("  Получено: %d\n", result);
        }
    }

    // Метод для красивого вывода массива
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}