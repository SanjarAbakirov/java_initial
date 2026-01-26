// -------- 217 Contains duplicate -----
// int array nums -> if any value appears at leaste twice in the array 
// return true and oppiste false - find available dublicates

// input nums = [1, 2, 3, 4, 1]
// Output: true
// indices 0 and 3

import java.util.*;
// * - from util box, needed for hashset and set

class LeetWork {
    public static void main(String[] args) { // main is needed for start
        int[] nums1 = { 1, 7, 3, 4, 6, 2, 7 };
        boolean result = containsDuplicate(nums1);
        System.out.println("The duplicate is " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        // Hashset - unique elements collections
        // edge case
        if (nums == null || nums.length <= 1) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();
        // Set<Integer> - multiplicity of int -> Set - plurality
        // < > - it is generic - Integer - class cover of int
        // seen - variable - that have seen and collect number we have already passed
        // HashSet - is a hash table
        // <>() - is a constructor

        for (int num : nums) { // for each int the num in array
            // if there is a num in set - duplicate
            // create a variable - int num -> : means "inside"
            if (seen.contains(num)) { // check out and addition to set
                // seen.contains(num) - if arrays consists int num
                // contains() returns true if such int exists
                return true;
            }
            seen.add(num); // seen - that we have seen we add(num)
        }
        return false;
    }
}