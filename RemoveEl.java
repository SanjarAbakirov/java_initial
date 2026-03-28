// package RemoveElFromArr.java;

public class RemoveEl {
    // public int removeElement(int[] nums, int val) {
    // int k = 0; // индексы, уда будем записывать подходящие элементы
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] != val) {
    // nums[k] = nums[i];
    // k++;
    // }
    // }
    // return k;
    // }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                // replace with the last element (which might also be val, but will be handled
                // next loop)
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left; // left = number of elements != val
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3, 2, 3, 3, 2 };
        int val = 3;
        RemoveEl me = new RemoveEl();
        int newLength = me.removeElement(nums, val);
        System.out.println("New length after removal is: " + newLength);
    }
}
