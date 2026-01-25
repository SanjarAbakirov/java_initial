// public class Solution {
// public int maxProfit(int[] prices) {
// int n = prices.length;
// int max_profit = 0;

// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// int profit = prices[j] - prices[i];
// if (profit > max_profit) {
// max_profit = profit;
// }
// }
// }
// return max_profit;
// }

// // method for testing
// public static void main(String[] args) {
// Solution solution = new Solution();
// // test data
// int[] prices = { 7, 1, 5, 9, 3, 6, 4 }; // arr

// int result = solution.maxProfit(prices);
// System.out.println("maximum profit: " + result);
// }

// }

// // TC O(n^2)
// // SC O(1)

// // --------- input first iteration ---------
// // import java.util.Scanner;
// // // библиотека - специальный сканнер

// // class Main {
// // // class означает директория - Main имя директории
// // public static void main(String[] args) {
// // // public - публичный доступ все могут заходить
// // // main - главный контейнер
// // // static - не двигается. не нужно создавать объект
// // // void - ничего не возвращает
// // // String[] args - аргументы командной строки
// // // это все большая кнопка запуска
// // Scanner myObj = new Scanner(System.in); // Scanner - это как тип
// инструмента
// // // myObj - имя инструмента
// // // создаем новый - new со своим именем
// // // Scanner() - конструктор - инструкция по сборке
// // // Sysytem.in - входная дверь в команту - откуда читать

// // // по сути я говорю - Сканнер мой объект равно новый Сканер в нем
// системный
// // вход
// // // создай нового рабочего на заводе

// // System.out.println("Enter username");
// // // System - система (весь компьютер)
// // // .out - куда выводить
// // // .println - Напечатай строку (print line)
// // // Enter username - текст для печати

// // // по сути говорим через интерфейс - скажи имя

// // String userName = myObj.nextLine();
// // // String - тип строка текста буквы
// // // username - переменная
// // // = означает - присвой
// // // myObj - имя субъекта (наш Scanner)
// // // .nextLine() - метод прочитай строку

// // System.out.println("Username is: " + userName);
// // // System - система (весь компьютер)
// // // .out - куда выводить
// // // .println - Напечатай строку (print line)
// // }
// // }

// -------- 438. Find All Anagrams in a String --------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Step 1. The list for keeping results of search
        // ArrayList is dynamic array - starches
        List<Integer> anagramIndices = new ArrayList<>();

        // Step 2. Check out edge cases like s > p -> false
        if (p.length() > s.length()) {
            // return empty array
            return anagramIndices;
        }
        // cheking out empty string
        if (s.isEmpty() || p.isEmpty()) {
            return anagramIndices;
        }
        // Step 3. Create length of string arrays for usebility
        int n = s.length(); // length of s
        int m = p.length(); // length of p

        // Step 4. Frequency arrays -> a-z En 26 letters
        // index 0 -> 'a', index 1 -> 'b', ..., index 25 -> 'z'
        int[] targetFreq = new int[26]; // for p string - a-z 26
        int[] currentFreq = new int[26]; // for window currentt s
        // it counts how many wich letters are there in array

        // Step 5. Fill in frequency array for p and window currentt s
        for (int i = 0; i < m; i++) {
            // for p string
            char pChar = p.charAt(i);
            // Transform letters to idx: "a" -> 0, "b" -> 1. etc.
            int pIndex = pChar - 'a';
            targetFreq[pIndex]++; // itterate counter of the letter

            // for the first window of the s string
            char sChar = s.charAt(i);
            int sIndex = sChar - 'a';
            currentFreq[sIndex]++;
            // so here we fill in the window

        }
        // Step 6. Check out first window
        // method Arrays.euals compares two arrays by each element
        if (Arrays.equals(targetFreq, currentFreq)) {
            // if it coincide - than the first window is anagram
            anagramIndices.add(0); // adding the index
        }
        // Step 7. Sliding window on the string s
        // starting from the second window (I = 1) before the last possible
        for (int start = 1; start <= n - m; start++) {
            // the condition i < = n - m - means that the last window starts from the idx
            // n-m
            // Ex. s = "hello" (n = 5), p = "||" (m = 2)
            // so than the ;ast window will be started from the idx 5 - 2 = 3
            // when the window moves: 1) one symbole moves out to the left (idx start - 1)
            // 2) adds a new one from the right side (idx strat + m - 1)

            // Than we delet a symbol that moves out from the window
            char leavingChar = s.charAt(start - 1);
            int leavingIndex = leavingChar - "a";
            currentFreq[leavingIndex]--; // decreasig the counter

        }
    }
}