import java.util.*;

class FindTheDifferenceStr {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        // Суммируем ASCII‑коды всех символов в t
        for (char c : t.toCharArray()) {
            sum += c;
        }
        // Вычитаем ASCII‑коды всех символов в s
        for (char c : s.toCharArray()) {
            sum -= c;
        }
        // Остаток – это ASCII‑код добавленной буквы
        return (char) sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Пример 1
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("s = " + s1 + ", t = " + t1);
        System.out.println("Added letter: " + sol.findTheDifference(s1, t1));
        System.out.println();

        // Пример 2
        String s2 = "a";
        String t2 = "aa";
        System.out.println("s = " + s2 + ", t = " + t2);
        System.out.println("Added letter: " + sol.findTheDifference(s2, t2));
        System.out.println();

        // Пример 3
        String s3 = "aeiou";
        String t3 = "aeioua";
        System.out.println("s = " + s3 + ", t = " + t3);
        System.out.println("Added letter: " + sol.findTheDifference(s3, t3));
        System.out.println();

        // Пример 4 (буквы могут повторяться)
        String s4 = "hello";
        String t4 = "helloo";
        System.out.println("s = " + s4 + ", t = " + t4);
        System.out.println("Added letter: " + sol.findTheDifference(s4, t4));
    }
}



