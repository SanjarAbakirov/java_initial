// ----------70-----------
public class ClimbStairs {

    // -----way #1------------
    // public int climbStairs(int n) {
    // int[] dp = new int[n + 1];
    // return helper(n, dp);
    // }

    // public int helper(int n, int[] dp) {
    // if (n == 0 || n == 1) {
    // return 1;
    // }
    // if (dp[n] != 0) {
    // return dp[n];
    // }
    // return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    // }

    // -------way # 2 ---------------
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        ClimbStairs solution = new ClimbStairs();

        System.out.println("Testing task 'Climbing stairs': ");
        System.out.println("=".repeat(40));

        int[] testCases = { 1, 2, 3, 4, 5, 6, 10, 45, 55 };
        int[] expected = { 1, 2, 3, 4, 8, 13, 89, 90, 100 };

        for (int i = 0; i < testCases.length; i++) {
            int n = testCases[i];
            int result = solution.climbStairs(n);
            int expectedResult = expected[i];

            boolean passed = (result == expectedResult);

            System.out.printf("n = %-2d -> Result: %-3d | Expected: %-3d | %s%n", n, result, expectedResult,
                    passed ? "O Passed" : "X Mistake");
        }
    }
}
