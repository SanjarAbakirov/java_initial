public class Palindrome {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String[] testCases = {
                "racecar", // true - простое слово
                "A man a plan a canal Panama", // true - фраза
                "hello", // false - не палиндром
                "12321", // true - число как строка
                "Madam, I'm Adam", // true - с пунктуацией
        };
        for (String test : testCases) {
            boolean result = isPalindrome(test);
            System.out.printf("\"%s\" → %s%n", test, result ? "Палиндром ✅" : "Не палиндром ❌");
        }
    }
}
