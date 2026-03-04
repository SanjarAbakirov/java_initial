import java.util.*;
import java.util.List;

public class ExponentEx {
    // -------O(2^n)------
    public static void main(String[] args) {
        // ------three objects-----
        String[] objects = { "triangle", "cube", "circul" };
        // Lookin for all possible options
        List<List<String>> allSet = findAllSets(objects);
        System.out.println("All possible sets of objects");
        for (List<List> set : allSet)
            ;
        System.out.println("All sets: " + allSet.size());
        // Here we have complexity O(2^n)

    }
}
