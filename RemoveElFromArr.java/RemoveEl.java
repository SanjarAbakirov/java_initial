// package RemoveElFromArr.java;

public class RemoveEl {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums.removeIf(nums[i] == val);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        RemoveEl me = new RemoveEl();
        int newLength = me.removeElement(nums, val);
        System.out.println("Majority element is: " + newLength);
    }

}
