import java.util.*;

class SortAnagram {
    public static void main(String[] args) {
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        // Ключ: отсортированная строка, Значение: список анаграмм
        Map<String, List<String>> groups = new HashMap<>();

        // Перебираем каждое слово в массиве
        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];

            // Шаг 1: Преобразуем строку в массив символов
            char[] charArray = currentWord.toCharArray();
            // Шаг 2: Сортируем символы
            Arrays.sort(charArray);
            // Шаг 3: Создаём ключ (отсортированная строка)
            String sortedKey = new String(charArray);

            // Шаг 4: Проверяем, есть ли уже такой ключ в map
            if (!groups.containsKey(sortedKey)) {
                // Если нет - создаём новый список
                groups.put(sortedKey, new ArrayList<>());
            }

            // Шаг 5: Добавляем текущее слово в список анаграмм
            groups.get(sortedKey).add(currentWord);

            // Более короткая запись (вместо шагов 4-5):
            // groups.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(currentWord);
        }

        // Выводим результат
        System.out.println("Результат группировки анаграмм:");
        for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
            System.out.println("Ключ '" + entry.getKey() + "' → " + entry.getValue());
        }

        // Альтернативный вывод только списков групп
        System.out.println("\nТолько группы:");
        for (List<String> group : groups.values()) {
            System.out.println(group);
        }
    }
}
