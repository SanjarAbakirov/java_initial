public class ValidPalindrome {
    StringBuilder builder = new StringBuilder();for(
    char ch:s.toCharArray())
    {
        if (Character.isLetterOrDigit(ch)) {
            builder.append(Character.toLowerCase(ch));
        }
    }
    String cleaned = builder.toString();
    String reversed = builder.reverse().toString();return cleaned.equals(reversed);

    public class Main {
        public static void main(String[] args) {
            ValidPalindrome vp = new ValidPalindrome();
            System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama")); // true
            System.out.println(vp.isPalindrome("race a car")); // false
        }
    }
}
