//=== 189 ===
// class RotateArray {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         int[] result = new int[n];
//         for (int i = 0; i < 0; i++) {
//             result[(i + k) % n] = nums[i];
//         }
//         System.arraycopy(result, 0, nums, 0, n);
//     }
// }

//=== second solution ====
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverse(0, n - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, n - 1, nums);
    }

    public static void reverse(int s, int e, int[] nums) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}