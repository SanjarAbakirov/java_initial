
// -------- 438. Find All Anagrams in a String --------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class findAnagramInStr {
    public List<Integer> findAnagrams(String s, String p) {
        // Step 1. The list for keeping results of search
        // ArrayList is dynamic array - starches
        List<Integer> anagramIndices = new ArrayList<>();

        // Step 2. Check out edge cases like s > p -> false
        if (p.length() > s.length()) {
            // return empty array
            return anagramIndices;
        }
        // cheking out empty string
        if (s.isEmpty() || p.isEmpty()) {
            return anagramIndices;
        }
        // Step 3. Create length of string arrays for usebility
        int n = s.length(); // length of s
        int m = p.length(); // length of p

        // Step 4. Frequency arrays -> a-z En 26 letters
        // index 0 -> 'a', index 1 -> 'b', ..., index 25 -> 'z'
        int[] targetFreq = new int[26]; // for p string - a-z 26
        int[] currentFreq = new int[26]; // for window currentt s
        // it counts how many wich letters are there in array

        // Step 5. Fill in frequency array for p and window currentt s
        for (int i = 0; i < m; i++) {
            // for p string
            char pChar = p.charAt(i);
            // Transform letters to idx: "a" -> 0, "b" -> 1. etc.
            int pIndex = pChar - 'a';
            targetFreq[pIndex]++; // itterate counter of the letter

            // for the first window of the s string
            char sChar = s.charAt(i);
            int sIndex = sChar - 'a';
            currentFreq[sIndex]++;
            // so here we fill in the window

        }
        // Step 6. Check out first window
        // method Arrays.euals compares two arrays by each element
        if (Arrays.equals(targetFreq, currentFreq)) {
            // if it coincide - than the first window is anagram
            anagramIndices.add(0); // adding the index
        }
        // Step 7. Sliding window on the string s
        // starting from the second window (I = 1) before the last possible
        for (int start = 1; start <= n - m; start++) {
            // the condition i < = n - m - means that the last window starts from the idx
            // n-m
            // Ex. s = "hello" (n = 5), p = "||" (m = 2)
            // so than the ;ast window will be started from the idx 5 - 2 = 3
            // when the window moves: 1) one symbole moves out to the left (idx start - 1)
            // 2) adds a new one from the right side (idx strat + m - 1)

            // Than we delete a symbol that moves out from the window
            char leavingChar = s.charAt(start - 1);
            int leavingIndex = leavingChar - 'a';
            currentFreq[leavingIndex]--; // decreasig the counter

            // add symbol, from thw window (that came)
            char enteringChar = s.charAt(start + m - 1);
            int enteringIndex = enteringChar - 'a';
            currentFreq[enteringIndex]++; // increase counter

            // check out is new window is anagramm
            if (Arrays.equals(targetFreq, currentFreq)) {
                // if yes, we add idx of the start of this window
                anagramIndices.add(start);
            }
        }
        // Step 8. Return the result
        return anagramIndices;
    }

    public static void main(String[] args) {
        String s = "funeral";
        String p = "real fun";
        // if (findAnagrams(s, t)) {
        // System.out.println("It is an anargam");
        // } else {
        // System.out.println("No it is not anagram");
        // }
    }
}