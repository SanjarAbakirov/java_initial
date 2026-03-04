import java.util.*;

public class ExponentEx {
    // -------O(2^n)------
    public static void main(String[] args) {
        // ------three objects-----
        String[] objects = { "triangle", "cube", "circul" };
        // Lookin for all possible options
        List<List<String>> allSets = findAllSets(objects);
    }
}
