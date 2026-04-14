import java.util.ArrayList;
import java.util.List;

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
}