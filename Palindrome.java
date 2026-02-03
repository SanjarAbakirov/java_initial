public class Palindrome {

    // -----1. Reverse str method -----------
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // ------2. Two Pointers method ----------
    // public boolean isPalindrome(String s) {
    // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    // // Устанавливаем указатели
    // int left = 0; // Начало строки
    // int right = cleaned.length() - 1; // Конец строки

    // // 3. Двигаем указатели навстречу
    // while (left < right) {
    // // Сравниваем символы на позициях left и right
    // if (cleaned.charAt(left) != cleaned.charAt(right)) {
    // return false; // Не совпали - не палиндром
    // }
    // // Сдвигаем указатели
    // left++; // двигаем вправо
    // right--; // двигаем влево
    // }
    // return true; // Все символы совпали
    // }

    // ------- Recursion ---------
    // public boolean isPalindrome(String s) {
    // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    // return isPalindromeHelper(cleaned, 0, cleaned.length() - 1);
    // }

    // private boolean isPalindromeHelper(String s, int left, int right) {
    // if (left >= right) {
    // return true;
    // }
    // return s.charAt(left) == s.charAt(right) && isPalindromeHelper(s, left + 1,
    // right - 1);
    // }

    // ---------------
    public static void main(String[] args) {

        Palindrome palindromeCheker = new Palindrome();

        String[] testCases = {
                "racecar", // true - простое слово
                "A man a plan a canal Panama", // true - фраза
                "hello", // false - не палиндром
                "12321", // true - число как строка
                "Madam, I'm Adam", // true - с пунктуацией
                "Sanjar", // not
        };
        for (String test : testCases) {
            boolean result = palindromeCheker.isPalindrome(test);
            System.out.printf("\"%s\" → %s%n", test, result ? "Палиндром ✅" : "Не палиндром ❌");
        }
    }
}
