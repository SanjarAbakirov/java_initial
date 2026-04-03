// import java.util.*;

// class SortAnagram {
//     public static void main(String[] args) {
//         String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

//         // Ключ: отсортированная строка, Значение: список анаграмм
//         Map<String, List<String>> groups = new HashMap<>();

//         // Перебираем каждое слово в массиве
//         for (int i = 0; i < input.length; i++) {
//             String currentWord = input[i];

//             // Шаг 1: Преобразуем строку в массив символов
//             char[] charArray = currentWord.toCharArray();
//             // Шаг 2: Сортируем символы
//             Arrays.sort(charArray);
//             // Шаг 3: Создаём ключ (отсортированная строка)
//             String sortedKey = new String(charArray);

//             // Шаг 4: Проверяем, есть ли уже такой ключ в map
//             if (!groups.containsKey(sortedKey)) {
//                 // Если нет - создаём новый список
//                 groups.put(sortedKey, new ArrayList<>());
//             }

//             // Шаг 5: Добавляем текущее слово в список анаграмм
//             groups.get(sortedKey).add(currentWord);

//             // Более короткая запись (вместо шагов 4-5):
//             // groups.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(currentWord);
//         }

//         // Выводим результат
//         System.out.println("Результат группировки анаграмм:");
//         for (Map.Entry<String, List<String>> entry : groups.entrySet()) {
//             System.out.println("Ключ '" + entry.getKey() + "' → " + entry.getValue());
//         }

//         // Альтернативный вывод только списков групп
//         System.out.println("\nТолько группы:");
//         for (List<String> group : groups.values()) {
//             System.out.println(group);
//         }
//     }
// }

// ==== the second way=====

// import java.util.*;

// public class Solution {
// public List<List<String>> groupAnagrams(String[] strs) {
// if (strs == null || strs.length == 0) {
// return new ArrayList<>();
// }

// Map<String, List<String>> map = new HashMap<>();

// for (String word : strs) {
// // Сортируем символы для получения ключа
// char[] chars = word.toCharArray();
// Arrays.sort(chars);
// String key = new String(chars);

// // Добавляем слово в соответствующую группу
// if (!map.containsKey(key)) {
// map.put(key, new ArrayList<>());
// }
// map.get(key).add(word);
// }

// return new ArrayList<>(map.values());
// }

// // Тестирование
// public static void main(String[] args) {
// Solution sol = new Solution();
// String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

// List<List<String>> result = sol.groupAnagrams(strs);

// System.out.println(result);
// // Вывод: [[eat, tea, ate], [tan, nat], [bat]]
// }
// }

// ==== the third method =====
// import java.util.*;

import java.util.*;

class SortAnagram {
    public List<List<String>> sortAnagram(String[] strs) {
        // Проверка на пустой вход
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Получаем ключ-сигнатуру (отсортированная строка)
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Добавляем слово в соответствующую группу
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);

            // Или используем computeIfAbsent (более кратко):
            // map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}