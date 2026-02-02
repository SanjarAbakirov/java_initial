import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNUms {
    public List<Integer> FindDisappearedNUms(int[] nums) {
        List<Integer> result = new ArrayList<>(); // var result - arrayof int, receives missed int
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
    }
}
