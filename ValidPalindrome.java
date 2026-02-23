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
}
