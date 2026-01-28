public class MissingNumber {
    public int missingNumber(int[] nums) {
        int result = 0;

        // XOR all indexs (0 ..n)
        for (int i = 0; i <= nums.length; i++) {
            result ^= i; // bite comparison
        }

        // XOR for all number from array
        for (int num : nums) {
            result ^= num;
        }

        // finally it will be the last num
        return result;
    }

    public static void main(String[] args) {
        MissingNumber solver = new MissingNumber();

        // Tests
        int[] test1 = { 3, 0, 1 };
        System.out.println("Test 1: " + solver.missingNumber(test1)); // 2
        int[] test2 = { 0, 2, 1, 4 };
        System.out.println("Test 2: " + solver.missingNumber(test2)); // 3
        int[] test3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Test 3: " + solver.missingNumber(test3)); // 8
    }
}
