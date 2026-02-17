public class SumDigitDifferences {

    public static int sumOfDigitDifferences(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        // Определяем количество цифр (предполагаем, что все числа имеют одинаковую
        // длину)
        int numDigits = String.valueOf(nums[0]).length();
        int totalSum = 0;

        // Перебираем все пары i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Преобразуем числа в строки для посимвольного сравнения
                String s1 = String.valueOf(nums[i]);
                String s2 = String.valueOf(nums[j]);
                int diff = 0;
                for (int pos = 0; pos < numDigits; pos++) {
                    if (s1.charAt(pos) != s2.charAt(pos)) {
                        diff++;
                    }
                }
                totalSum += diff;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] nums = { 13, 23, 12 };
        System.out.println(sumOfDigitDifferences(nums)); // Ожидаем 4
    }

}
