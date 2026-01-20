// public class Solution {
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
//         Solution solution = new Solution();
//         // test data
//         int[] prices = { 7, 1, 5, 9, 3, 6, 4 }; // arr

//         int result = solution.maxProfit(prices);
//         System.out.println("maximum profit: " + result);
//     }

// }

// TC O(n^2)
// SC O(1)

// --------- input first iteration ---------
import java.util.Scanner; // библиотека - специальный сканнер

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

    }
}
