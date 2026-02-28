
// --------- 2824 ------------------
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CountPairsLessThenTarget {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int sum = nums[i] + nums[j];
                if (sum < target) {
                    sum += count;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int target = 7;
        System.out.println("The quantity of the pairs that less" + target + " = " + result);

    }
}
