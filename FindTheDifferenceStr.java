import java.util.*;

class FindTheDifferenceStr {
    public char FindTheDifferenceStrX(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return c;
            }
            int count = map.get(c);
            if (count == 0) {
                return c;
            }
            map.put(c, count - 1);
        }
        return ' ';
    }

    public static void main(String[] args) {
        FindTheDifferenceStr sol = new FindTheDifferenceStr();

        // Пример 1
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("s = " + s1 + ", t = " + t1);
        System.out.println("Added letter: " + sol.FindTheDifferenceStrX(s1, t1));
        System.out.println();

        // Пример 2
        String s2 = "a";
        String t2 = "aa";
        System.out.println("s = " + s2 + ", t = " + t2);
        System.out.println("Added letter: " + sol.FindTheDifferenceStrX(s2, t2));
        System.out.println();

        // Пример 3
        String s3 = "aeiou";
        String t3 = "aeioua";
        System.out.println("s = " + s3 + ", t = " + t3);
        System.out.println("Added letter: " + sol.FindTheDifferenceStrX(s3, t3));
        System.out.println();

        // Пример 4 (буквы могут повторяться)
        String s4 = "hello";
        String t4 = "helloo";
        System.out.println("s = " + s4 + ", t = " + t4);
        System.out.println("Added letter: " + sol.FindTheDifferenceStrX(s4, t4));
    }
}



