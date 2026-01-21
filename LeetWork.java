// -----------------704. Binary Search------------------
// Given an array of integers nums which is sorted in ascending order, and an
// integer target,
// write a function to search target in nums. If target exists, then return its
// index.
// Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

// Example 2:
// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1

class Solution {
    public int search(int[] nums, int target) {
        int left = 0; // the left part of research - from 0 index
        int right = nums.length - 1; // the right part and end of array
        // nums.length - 1 means the last idx

        while (left <= right) { // if left > right - elements ended
            int mid = left + (right - left) / 2; // safely defined middle
            // left = 0, right = 5 (Example)
            // mid = 0 + (5 - 0) / 2 = 2 (Example)
            if (nums[mid] == target) {
                return mid; // we found it
            } else if (nums[mid] < target) {
                left = mid + 1; // searching in the right part
            } else {
                right = mid - 1; // searching in the left part
            }
        }
        return -1; // not found
    }
}

// target=9
// nums=[-1,0,3,5,9,12]
