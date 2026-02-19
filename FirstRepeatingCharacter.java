public class FirstRepeatingCharacter {
    public static char firstLetterToAppearTwice(String s) {
        boolean[] seen = new boolean[32]; // для отслеживания встреченных букв
        for (char c : s.toCharArray()) {
            int index = c - 'a'; // получаем индекс буквы (0-25)
            if (seen[index]) {
                return c; // если буква уже встречалась, возвращаем её
            }
            seen[index] = true; // помечаем как встреченную
        }
        return ' '; // по условию задачи всегда есть повторяющаяся буква
    }

    public static void main(String[] args) {
        String s = "суббота";
        System.out.println("Первая повторяющаяся буква: " + firstLetterToAppearTwice(s)); // ожидается 'c'
    }
}
