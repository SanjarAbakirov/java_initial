import java.math.BigInteger;

// not big integer
// class Add_binary {
// public static void main(String[] args) {
// String a = "100";
// String b = "11";
// int sum1 = Integer.parseInt(a, 2);
// int sum2 = Integer.parseInt(b, 2);

// int sum = sum1 + sum2;
// String result = Integer.toBinaryString(sum);
// System.out.println("the result is: " + result);
// }
// }

// big integer
class Add_binary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        // ----первое решение---
        // Add_binary obj = new Add_binary(); // создаём объект, чтобы вызвать
        // нестатический метод
        // String result = obj.addBinary(a, b);
        // System.out.println("the result is: " + result); // вывод результата

        // -----второе решение----

        // Вызываем метод сложения
        String result = addBinary(a, b);

        // Выводим результат
        System.out.println("Сумма: " + result);
    }
    // --- первое решение----
    // public String addBinary(String a, String b) {
    // BigInteger sum1 = new BigInteger(a, 2);
    // BigInteger sum2 = new BigInteger(b, 2);
    // BigInteger sum = sum1.add(sum2);
    // System.out.println("the result is: " + sum);
    // return sum.toString(2);
    // }

    public static String addBinary(String a, String b) {
        // Будем собирать результат в переменную StringBuilder (удобно добавлять
        // символы)
        StringBuilder result = new StringBuilder();

        // Индексы для прохода по строкам с конца (начинаем с младших битов)
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0; // перенос (0 или 1)

        // Идём, пока есть символы в любой строке или есть перенос
        while (i >= 0 || j >= 0 || carry > 0) {
            // Берём биты из строк (если индекс вышел за пределы — считаем 0)
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            // Сумма текущих битов и переноса
            int sum = bitA + bitB + carry;

            // Текущий бит результата — остаток от деления на 2
            result.append(sum % 2);
            // Новый перенос — результат деления на 2 (0 или 1)
            carry = sum / 2;

            // Перемещаемся влево
            i--;
            j--;
        }
        // Мы собирали результат от младших битов к старшим, поэтому разворачиваем
        return result.reverse().toString();
    }
}