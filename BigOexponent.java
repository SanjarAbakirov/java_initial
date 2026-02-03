// --------O(2^n)---exponent---------
// create sets fron three items

import java.util.*;

public class BigOexponent {
    public static void main(String[] args) {
        String[] objects = { "triangle", "rectangle", "circle" };
        List<List<String>> allSets = findAllSets(objects);

        System.out.println("All possible sets of objects:");

        // output all subsets
        for (List<String> set : allSets) {
            // space complexity O(2 ^ n)
            System.out.println(set);
        }

        // output quatity of subsets
        System.out.println("Total num of sets: " + allSets.size());
        System.out.println("Time complexity: 0(2^n) where n = " + objects.length);
        System.out.println("Space complexity: O(2^n)");
    }

    public static List<List<String>> findAllSets(String[] objects) {
        List<List<String>> result = new ArrayList<>();

        // begin from empty
        result.add(new ArrayList<>());
        // for each object
        for (String obj : objects) {
            // take all existing sets and add new object
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<String> existingSet = result.get(i);
                // create new subset = old + current
                List<String> newSet = new ArrayList<>(existingSet); /// copy it
                newSet.add(obj); // add new object
                result.add(newSet); // add new subset to result
            }
        }
        return result;
    }
}
