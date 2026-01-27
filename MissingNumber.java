public class MissingNumber {
    public int missingNumber(int[] nums) {
        int result = 0;

        // XOR all indexs (0 ..n)
        for (int i = 0; i <= nums.length; i++) {
            result ^= i;
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
        int[] test2 = { 0, 1 };
        System.out.println("Test 1: " + solver.missingNumber(test2));
    }
}
