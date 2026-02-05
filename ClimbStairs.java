public class ClimbStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return helper(n, dp);
    }

    public int helper(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    }

    public static void main(String[] args) {
        ClimbStairs solution = new ClimbStairs();

        System.out.println("Testing task 'Climbing stairs': ");
        System.out.println("=".repeat(40));
    }
}
