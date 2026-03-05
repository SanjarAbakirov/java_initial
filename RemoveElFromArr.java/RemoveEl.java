// package RemoveElFromArr.java;

public class RemoveEl {
    public int removeElement(int[] nums, int val) {
        int k = 0; // индексы, уда будем записывать подходящие элементы
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums.remove(nums[i]);
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        RemoveEl me = new RemoveEl();
        int newLength = me.removeElement(nums, val);
        System.out.println("New length after removal is: " + newLength);
    }
}
