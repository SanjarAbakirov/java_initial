public class LongCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Edge case: array with fulled array
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder ans = new StringBuilder();

        // The first string like example
        // the cicle works inside of the StringBuilder that is like array with strings

        for (int i = 0; i < strs[0].length(); i++) {
            // length() - write for strings
            // strs[0].length() - research length of words - elements
            char c = strs[0].charAt(i);
            boolean allEqual = true;

            for (int j = 1; j < strs.length; j++) {
                // if current str shorter or symbol is not coincide
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    allEqual = false;
                    break;
                }
            }

            if (allEqual) {
                ans.append(c); // added symbol
            } else {
                break;
            }
        }
        return ans.toString(); // return instead of returns
    }

    public static void main(String[] args) {
        LongCommonPrefix s = new LongCommonPrefix();

        // Пример 1: общий случай
        System.out.println(s.longestCommonPrefix(new String[] { "flower", "flow", "flight" })); // "fl"

        // Пример 2: нет общего префикса
        System.out.println(s.longestCommonPrefix(new String[] { "dog", "racecar", "car" })); // ""

        // Пример 3: все строки одинаковые
        System.out.println(s.longestCommonPrefix(new String[] { "test", "test", "test" })); // "test"

        // Пример 4: одна строка
        System.out.println(s.longestCommonPrefix(new String[] { "single" })); // "single"

        // Пример 5: пустой массив
        System.out.println(s.longestCommonPrefix(new String[] {})); // ""

        // Пример 6: есть пустая строка
        System.out.println(s.longestCommonPrefix(new String[] { "ab", "" })); // ""
    }
}
