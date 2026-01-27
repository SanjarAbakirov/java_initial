public class MissingNumber {
    public int missingNumber.main(int[] nums) {
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
}
