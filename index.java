// # ----from leetcode-----
// # расчитай по какой цене самое выгодно купить акции (цены в умассиве) и покакой продать)
// prices = [7, 1, 5, 3, 6, 4]

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        max_profit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[j];
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }
}