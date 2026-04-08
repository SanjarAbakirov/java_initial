public class RuRnningSum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int[] result = runningSum(nums);
        // Выводим результат (вариант с Arrays.toString)
        System.out.println("Результат: " + java.util.Arrays.toString(result));
        // Вывод: Результат: [1, 3, 6, 10]
    }

    public static int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i - 1];
        }
        return results;
    }
}

// Output:[1,3,6,10]
// Explanation: Running sum is obtained as follows:[1,1+2,1+2+3,1+2+3+4]