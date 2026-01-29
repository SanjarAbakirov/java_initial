// ---------- 121 Max profit -----O(n^2)--------
// public class MaxProfit {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int max_profit = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int profit = prices[j] - prices[i];
//                 if (profit > max_profit) {
//                     max_profit = profit;
//                 }
//             }
//         }
//         return max_profit;
//     }

//     // method for testing
//     public static void main(String[] args) {
//         MaxProfit maxProfit = new MaxProfit();

//         int[] prices = { 7, 1, 5, 3, 6, 4 };
//         int result = maxProfit.maxProfit(prices);
//         System.out.println("maximum profit: " + result);
//     }
// }

// ---------- 121 Max_profit solutuon #2-----O(n)-
// class Solution {
//     public int maxProfit(int[] prices) {
//         if (prices.length == 0)
//             return 0;

//         int min_price = prices[0];
//         int max_profit = 0;

//         for (int i = 1; i < prices.length; i++) {
//             if (prices[i] < min_price) {
//                 min_price = prices[i];
//             }

//             else if (prices[i] - min_price > max_profit) {
//                 max_profit = prices[i] - min_price;
//             }
//         }
//         return max_profit;
//     }

//     // method for testing
//     public static void main(String[] args) {
//         Solution maxProfit = new Solution();

//         int[] prices = { 7, 1, 5, 3, 6, 4 };
//         int result = maxProfit.maxProfit(prices);
//         System.out.println("maximum profit: " + result);
//     }
// }

// --------- 121 Max Profit -------- Shabdan----O(n)-
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int n = prices.length;
        int min_price = prices[0];
        int max_profit = 0;

        for (int i = 1; i < n; i++) {
            // sell day
            if (prices[i] < min_price) {
                min_price = prices[i];
            }

            else if (prices[i] - min_price > max_profit) {
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }

    // method for testing
    public static void main(String[] args) {
        Solution maxProfit = new Solution();

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit.maxProfit(prices);
        System.out.println("maximum profit: " + result);
    }
}