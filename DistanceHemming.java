// 1. Расстояние Хэмминга
// Даны два целых числа x и y. Найдите количество позиций, в которых их двоичные
// представления различаются.
// Подсказка: используйте XOR (x ^ y), а затем примените ваш метод
// hammingWeight.
// Пример:
// x = 2 (01), y = 5 (100)

public class DistanceHemming {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;

    }

    public static int hammingDistance(int x, int y) {
        return hammingWeight(x ^ y);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int result = hammingDistance(x, y);
        System.out.println("x = " + x + " (binary: " + Integer.toBinaryString(x) + ")");
        System.out.println("y = " + y + " (binary: " + Integer.toBinaryString(y) + ")");
        System.out.println("x ^ y = " + (x ^ y) + " (binary: " + Integer.toBinaryString(x ^ y) + ")");
        System.out.println("Расстояние Хэмминга = " + result);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
    }
}
