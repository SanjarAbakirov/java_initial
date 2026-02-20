public class CheckDistanceSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        int[] first = new int[26];
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (first[idx] == -1) {
                first[idx] = i;
            } else {
                int gap = i - first[idx] - 1;
                if (gap != distance[idx]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckDistanceSameLetters checker = new CheckDistanceSameLetters();
        String s = "abccba";
        int[] distance = new int[26];
        // Заполняем distance для a,b,c согласно примеру
        // Для 'a' (индекс 0) расстояние 4
        distance[0] = 4;
        // Для 'b' (индекс 1) расстояние 2
        distance[1] = 2;
        // Для 'c' (индекс 2) расстояние 0
        distance[2] = 0;
        // Остальные индексы по умолчанию 0, но они не используются, так как букв нет
        boolean result = checker.checkDistances(s, distance);
        System.out.println("Is well-spaced? " + result);
    }

}
