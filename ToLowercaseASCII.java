public class ToLowercaseASCII {
    public static void main(String[] args) {
        String str = "HeLLo";
        String lower = toLowerCaseAscii(str);
        System.out.println(lower); // hello
    }

    public static String toLowerCaseAscii(String input) {
        if (input == null)
            return null;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Проверяем, находится ли символ в диапазоне 'A'..'Z' (ASCII 65..90)
            if (ch >= 'A' && ch <= 'Z') {
                // Преобразуем в строчную букву: разница между кодами 'a' и 'A' равна 32
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
}