// 1. Расстояние Хэмминга
// Даны два целых числа x и y. Найдите количество позиций, в которых их двоичные
// представления различаются.
// Подсказка: используйте XOR (x ^ y), а затем примените ваш метод
// hammingWeight.
// Пример:
// x = 2 (01), y = 5 (100)

public class DistanceHemming {
    public int distanceHemming(int x, int y) {
        return (x ^ y);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
    }
}
