public class TotalHammptingSolution {
    class Solution {
        public int totalHammingDistance(int[] nums) {
            if (nums == null) {
                return 0;
            }
            int distance = 0;
            for (int i = 0; i < 32; i++) {
                int once_count = 0;
                for (int j = 0; j < nums.length; i++) {
                    once_count += (nums[j] >> i) & 1;
                }
                distance += once_count * (nums.length - once_count);
            }
            return distance;
        }
    }
}
// Example 1:

// Input: nums = [4,14,2]
// Output: 6
// Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is
// 0010 (just
// showing the four bits relevant in this case).
// The answer will be:
// HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 +
// 2 + 2 = 6.
// Example 2:

// Input: nums = [4,14,4]
// Output: 4