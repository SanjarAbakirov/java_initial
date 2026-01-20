// public class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int max_profit = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int profit = prices[j] - prices[i];
//                 if (profit > max_profit) {
//                     max_profit = profit;
//                 }
//             }
//         }
//         return max_profit;
//     }

//     // method for testing
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         // test data
//         int[] prices = { 7, 1, 5, 9, 3, 6, 4 }; // arr

//         int result = solution.maxProfit(prices);
//         System.out.println("maximum profit: " + result);
//     }

// }

// TC O(n^2)
// SC O(1)

// --------- input first iteration ---------
import java.util.Scanner;
// библиотека - специальный сканнер

class Main {
    // class означает директория - Main имя директории
    public static void main(String[] args) {
        // public - публичный доступ все могут заходить
        // main - главный контейнер
        // static - не двигается. не нужно создавать объект
        // void - ничего не возвращает
        // String[] args - аргументы командной строки
        // это все большая кнопка запуска
        Scanner myObj = new Scanner(System.in); // Scanner - это как тип инструмента
        // myObj - имя инструмента
        // создаем новый - new со своим именем
        // Scanner() - конструктор - инструкция по сборке
        // Sysytem.in - входная дверь в команту - откуда читать

        // по сути я говорю - Сканнер мой объект равно новый Сканер в нем системный вход
        // создай нового рабочего на заводе

        System.out.println("Enter username");
        // System - система (весь компьютер)
        // .out - куда выводить
        // .println - Напечатай строку (print line)
        // Enter username - текст для печати

        // по сути говорим через интерфейс - скажи имя

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        // String - тип строка текста буквы
        // username - переменная
        // = означает - присвой
        // myObj - имя субъекта (наш Scanner)
        // .nextLine() - метод прочитай строку

    }
}
