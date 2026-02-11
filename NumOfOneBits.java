public class NumOfOneBits {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

public static void main(String[] args) { // main is needed for start
    int[] nums1 = { 1, 7, 3, 4, 6, 2, 7 };
    boolean result = containsDuplicate(nums1);
    System.out.println("The duplicate is " + result);
}