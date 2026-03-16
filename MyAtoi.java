// первый вариант
class MyAitoi {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int sign = 1;
        while (i < chars.length && chars[i] == ' ') {
            i++;
        }
        if (i == chars.length) {
            return 0;
        }
        if (chars[i] == '+' || chars[i] == '-') {
            if (chars[i] == '-') {
                sign = -1;
            }
            i++;
        }
        if (i >= chars.length || !Character.isDigit(chars[i])) {
            return 0;
        }
        int result = 0;
        while (i < chars.length && Character.isDigit(chars[i])) {
            int digit = chars[i] - '0';
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}