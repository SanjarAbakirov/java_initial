import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public int romanToInt(String s) {

    }

    public void main(String[] args) {
        Map<Character, Integer> romanMap = new HashMap<>();
        String I = 1;
        String V = 5;
        String X = 10;
        String L = 50;
        String C = 100;
        String D = 500;
        String M = 1000;
        String input = "MCMXCIV";
        int num = Integer.parseInt(I);
        String roman = romanToInt(input);
    }
}
