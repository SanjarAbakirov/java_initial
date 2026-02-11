// -------191. Number of 1 Bits-----------

public class NumOfOneBits {
    // public int hammingWeight(int n) {
    // return Integer.bitCount(n);
    // }

    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) { // int в Java — 32 бита
            count += (n >> i) & 1;
        }
        return count;
    }

   public static void main(String[] args) {
        int[] testNumbers = {
            0,          // двоично: 0 -> 0 единиц
            1,          // 1 -> 1
            2,          // 10 -> 1
            3,          // 11 -> 2
            4,          // 100 -> 1
            5,          // 101 -> 2
            7,          // 111 -> 3
            8,          // 1000 -> 1
            11,         // 1011 -> 3 (пример из условия)
            128,        // 10000000 -> 1
            255,        // 11111111 -> 8
            256,        // 100000000 -> 1
            Integer.MAX_VALUE // 2147483647, 31 единица
        };

        System.out.println("Проверка функции hammingWeight:\n");
        for (int n : testNumbers) {
            int bits = hammingWeight(n);
            System.out.printf("n = %-12d (binary: %32s) -> set bits: %d%n",
                              n, Integer.toBinaryString(n), bits);
        }



// public static int hammingWeight(int n) {
// int count = 0;
// while (n != 0) {
// n &= (n - 1);
// count++;
// }
// return count;
// }