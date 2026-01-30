public class SingleNumber {
    public int singleNUmber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(int[] nums) {

        int[] nums1 = { 1, 2, 3, 4, 2, 1, 3 };

        // System.out.println("maximum profit: " + result);
    }

}
