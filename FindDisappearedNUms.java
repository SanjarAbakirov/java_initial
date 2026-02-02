import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNUms {
    public List<Integer> FindDisappearedNUms(int[] nums) {
        List<Integer> result = new ArrayList<>(); // var result - arrayof int, receives missed int
        Set<Integer> set = new HashSet<>(); // Set - multiplicity of nums
        for (int num : nums) { // looks like for each, for each num in nums execute the following
            set.add(num); // set.add(num) - each num put to set<Integer>Set
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
    }
}
