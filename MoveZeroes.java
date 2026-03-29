import java.util.Arrays;

class MoveZeroes {
    // O(n) because two pointer is moving only to the right
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        while (r < n) {
            while (r < n && nums[r] == 0) {
                r++;
            }
            // if (r == l) {
            // break;
            // }
            // nums[r] != 0;
            nums[l] = nums[r];
            // if l = 0 we will rewrite it to l's place again
            l++;
            r++;
        }
        while (l > n) {
            nums[l] = 0;
        }
        l++;
    }

    public static void main(String[] args) {
        // 1. Create test input
        int[] nums = { 0, 1, 0, 3, 12, 0, 15 };

        // 2. Print original array (optional)
        System.out.println("Original: " + Arrays.toString(nums));

        // 3. Create an instance of your class
        MoveZeroes solution = new MoveZeroes();

        // 4. Call the method to modify the array
        solution.moveZeroes(nums);

        // 5. Print the result
        System.out.println("After moveZeroes: " + Arrays.toString(nums));
    }
}
