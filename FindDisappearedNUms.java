import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNums {
    public List<Integer> findDisappearedNums(int[] nums) {
        List<Integer> result = new ArrayList<>(); // var result - arrayof int, receives missed int list
        Set<Integer> set = new HashSet<>(); // Set - multiplicity of unique nums
        for (int num : nums) { // looks like for each, for each num in nums execute the following
            set.add(num); // set.add(num) - each num put to set<Integer>Set
        }
        for (int i = 1; i <= nums.length; i++) { // i<=nums.length; i++ searching before including n
            // starting cicle from i=1 -> range [1, n]
            if (!set.contains(i)) { // contains checks out what we have inside of Set, if set doesnot consists num
                                    // then show below
                result.add(i); // asent num is added
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNums finder = new FindDisappearedNums();

        // Test 1
        int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result1 = finder.findDisappearedNums((nums1);
        System.out.println("Test 1: " + result1));
    }
}
