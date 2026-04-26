import java.util.*;

// public class FizzBuzz {
//     public List<String> fizzBuzz(int n) {
//         List<String> answer = new ArrayList<>(n);

//         for (int i = 1; i <= n; i++) {
//             boolean divisibleBy3 = i % 3 == 0;
//             boolean divisibleBy5 = i % 5 == 0;

//             if (divisibleBy3 && divisibleBy5) {
//                 answer.add("FizzBuzz");
//             } else if (divisibleBy3) {
//                 answer.add("Fizz");
//             } else if (divisibleBy5) {
//                 answer.add("Buzz");
//             } else {
//                 answer.add(String.valueOf(i));
//             }
//         }
//         return answer;
//     }

//     public static void main(String[] args) {
//         FizzBuzz fb = new FizzBuzz();
//         List<String> result = fb.fizzBuzz(15);

//         for (String s : result) {
//             System.out.println(s);
//         }
//     }
// }
// TC: O(n)
// SC: O(1)

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currStr = "";

            if (divisibleBy3) {
                currStr += "Fizz";
            }
            if (divisibleBy5) {
                currStr += "Buzz";
            }
            if (currStr.isEmpty()) {
                currStr += String.valueOf(i);
            }
            answer.add(currStr);
        }
        return answer;
        // TC: O(n)
        // SC: O(1)
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        List<String> result = fb.fizzBuzz(30);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static class hashCode {
        public static void main(String args){
    //        creating of HashMap
            HashMap<String, String> Geeks = new HashMap<>();
    //      Adding values to Hashmap using put() method
            Geeks.put("Language", "Java");
            Geeks.put("Platform", "Geeks for IT");
            Geeks.put("Code", "HashMap");
            Geeks.put("Learn", "More");

    //        Printing out the values of the HashMap
            String language = Geeks.get("Language");
            System.out.println("Language: " + language);

    //        Using the containsKey() method to check if a key exists in the HashMap
            boolean containsKey = Geeks.containsKey("Code");
            System.out.println("Contains key 'Code'? " + containsKey);

    //        Using the containsValue() method to check if a value exists in the HashMap
            boolean containsValue = Geeks.containsValue("More");
            System.out.println("Contains Value 'More'? " + containsValue);

    //        Using the keySet() method to retrieve a Set of all keys in the HashMap
            Set<String> keySet = Geeks.keySet();
            System.out.println("Key set: " + keySet);

    //        Using the values() method to retrive a Collection of all values in the HashMap
            Set<Map.Entry<String, String>> entrySet = Geeks.entrySet();
            System.out.println("Entry Set: " + entrySet);

    //        Using the remove() method to remove a key-value pair from the HasMap
            System.out.println("hashmap contents after clear(): " + Geeks);

    //        Using the isEmpty method toi check if the HashMap is empty
            boolean isEmpty = Geeks.isEmpty();
            System.out.println("is Empty? " + isEmpty);
        }
    }
}