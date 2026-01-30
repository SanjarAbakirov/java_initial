public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        // Тесты
        int[] test1 = { 2, 2, 1 };
        System.out.println("Test 1: " + solution.singleNumber(test1)); // 1

        int[] test2 = { 4, 1, 2, 1, 2 };
        System.out.println("Test 2: " + solution.singleNumber(test2)); // 4

        int[] test3 = { 1 };
        System.out.println("Test 3: " + solution.singleNumber(test3)); // 1

        int[] test4 = { 7, 3, 5, 3, 7 };
        System.out.println("Test 4: " + solution.singleNumber(test4)); // 5
    }

}
