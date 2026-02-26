
// ----------338 ---------------
import java.util.Arrays;

public class CountingBits {
    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                ans[i] = Integer.bitCount(i);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        CountingBits cb = new CountingBits();
        Solution sol = cb.new Solution();

        int n = 5;
        int[] result = sol.countBits(n);

        System.out.println("n = " + n);
        System.out.println("Результат: " + Arrays.toString(result));
    }
}
