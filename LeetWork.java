// -------- 217 Contains duplicate -----
// int array nums -> if any value appears at leaste twice in the array 
// return true and oppiste false - find available dublicates

// input nums = [1, 2, 3, 4, 1]
// Output: true
// indices 0 and 3

import java.util.*;

class LeetWork {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 2 };
        boolean result = containsDuplicate(nums1);
        System.out.println("There is a duplicate: " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        // Hashset - unique elements collections
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // if there is a num in set - duplicate
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}