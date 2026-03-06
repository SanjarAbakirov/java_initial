import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put = ('I', 1);
        String V = 5;
        String X = 10;
        String L = 50;
        String C = 100;
        String D = 500;
        String M = 1000;

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < length - 1 && current < romanMap.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }

    public void main(String[] args) {

    }
}
