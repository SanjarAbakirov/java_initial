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

    public static void main(int args) {
        int n = 11;
    }

}

// public static int hammingWeight(int n) {
// int count = 0;
// while (n != 0) {
// n &= (n - 1);
// count++;
// }
// return count;
// }