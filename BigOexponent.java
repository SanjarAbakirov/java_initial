import java.util.*;

public class BigOexponent {
    public static void main(String[] args) {
        String[] objects = { "triangle", "rectangle", "circle" };
        List<List<String>> allSets = findAllSets(objects);

        System.out.println("All possible sets of objects");

        // output all subsets
        for (List<String> set : allSets){
        // space complexity O(2 ^ n)
            System.out.println(set);
        }

        // output quatity of subsets
        System.out.println("Total num of sets: " + allSets.size());
        System.out.println("All sets: " + findAllSets.size());
    public static List<List<String>>findAllSets(String[] objects) {
        List<List<String>>result = new ArrayList<>();
        // begin from empty
        result.add(new ArrayList<>());
        // for each object
        for (String[] object : objects);
        // take all existing sets and add new object
        int size = result.size();
        for (int i = 0; i < size; i++){
            List<List<String>> newSet = new ArrayList<>(result.get(i));
            newSet.add(object);
            result.add(newSet);
        }
    }
    return result;
    }
}
