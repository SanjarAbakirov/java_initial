//  --------344. Reverse String--------
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

class ReverseString {
    public void reverseString(char[] s) {
        int left = 0; // begining of the arr
        int right = s.length - 1; // emd of the arr

        while (left < right) { // меняем естами символы пока не указатели не встретятся
            char temp = s[left]; // сохраняем левый символ во временную переменную
            s[left] = s[right]; // переносим right символ to the place of the left символ
            s[right] = temp; // Переносим сохранённый левый символ на место правогo

            // move definderf to the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString reverser = new ReverseString();
        
        // Тест 1
        char[] test1 = {'h','e','l','l','o'};
        System.out.println("До: " + new String(test1));
        reverser.reverseString(test1);
        System.out.println("После: " + new String(test1));
        
        // Тест 2
        char[] test2 = {'H','a','n','n','a','h'};
        System.out.println("\nДо: " + new String(test2));
        reverser.reverseString(test2);
        System.out.println("После: " + new String(test2));
        
        // Тест 3: Пустая строка
        char[] test3 = {};
        System.out.println("\nПустой массив:");
        reverser.reverseString(test3);
        System.out.println("Длина: " + test3.length);
        }
    }
}