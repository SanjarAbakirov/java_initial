//import java.util.*;
//
//public class ExponentEx {
//    // -------O(2^n)------
//    public static void main(String[] args) {
//        // ------three objects-----
//        String[] objects = { "triangle", "cube", "circul" };
//        // Lookin for all possible options
//        List<List<String>> allSet = findAllSets(objects);
//        System.out.println("All possible sets of objects");
//        for (List<List> set : allSet)
//            ;
//        System.out.println("All sets: " + allSet.size());
//        // Here we have complexity O(2^n)
//    }
//
//    public static List<List<String>> FindAllSets(String[] Objects) {
//
//        List<List<String>> result = new ArrayList<>();
//        // Statr with empty
//        result.add(new ArrayList<>());
//
//        // for each object
//        for (String Object : Objects) {
//            // Take all axisting sets and add new Object
//            int size = result.size();
//            for (int i = 0; i < size; i++) {
//                List<List<String>> newSet = new ArrayList<>(result.get(i));
//                newSet.add(Object);
//                result.add(newSet);
//            }
//
//        }
//        return result;
//
//    }
//
//}
