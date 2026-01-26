// -------- Contains duplicate -----
// int array nums -> if any value appears at leaste twice in the array
// return true and oppiste false
// find available dublicates

// input nums = [1, 2, 3, 4, 1]
// Output: true
// indices 0 and 3

import java.util.*;

class LeetWork {
    public static boolean containsDuplicate(int[] nums) {
        // Hashset - unique elements
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // if there is a num in set - duplicate
            if (seen.contains(num)) {
                return true;
            }
        }

    }

    // public class FindDuplicates {
    // int[] nums = { 1, 2, 3, 4, 2 };System.out.println("True: "+

    // containsDuplicate(nums));
    // }
}