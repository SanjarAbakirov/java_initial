public class RemoveDuplicatesFromSortedArr {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int newLength = removeDuplicates(arr);
        System.out.println("New length is:" + newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
