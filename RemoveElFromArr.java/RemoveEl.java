package RemoveElFromArr.java;

public class RemoveEl {
    public int removeElement(int[] nums, int val) {

    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement me = new MajorityElement();
        int result = me.majorityElement(nums);
        System.out.println("Majority element is: " + result);
    }

}
