// class Solution {
// public int removeElement(int[] nums, int val) {
// int k = 0;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] != val) {
// nums[k] = nums[i];
// k++;
// }
// }
// return k;
// }

// public static void main(String[] args) {

// }
// }

// option 2

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }
}

// option 3
// import java.util.Arrays;

// class Solution {
// public int removeElement(int[] nums, int val) {
// int[] filtered = Arrays.stream(nums).filter(x -> x != val).toArray();
// System.arraycopy(filtered, 0, nums, 0, filtered.length);
// return filtered.length;
// }
// }