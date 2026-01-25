
// ------ 242. Valid Anagram------------- 
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "tac";
        if (isAnagram(s, t)) {
            System.out.println("It is anargam");
        } else {
            System.out.println("No it is not anagram");
        }
    }

    public static boolean isAnagram(String s, String t) {
        s = s.replace(" ", "").toLowerCase();
        t = t.replace(" ", "").toLowerCase();
        if (s.length() != t.length()) {
            return false;
        }
        char[] sLetter = s.toCharArray();
        char[] tLetter = t.toCharArray();

        Arrays.sort(sLetter);
        Arrays.sort(tLetter);
        return Arrays.equals(sLetter, tLetter);
    }
}
