class ReduceToZero {
    public int numberOfSteps(int number) {
        int counter = 0;

        while (number > 0) {
            boolean isEven = (number % 2 == 0);

            if (isEven == true) {
                number = number / 2;
            } else {
                number = number - 1;
            }

            counter = counter + 1;
        }

        return counter;
    }

    public static void main(String[] args) {
        ReduceToZero solution = new ReduceToZero();

        int num = 14;
        int result = solution.numberOfSteps(num);

        System.out.println("Input: num = " + num);
        System.out.println("Output: " + result);
    }
}

// second option
// public class Solution {
// public int numberOfSteps(int number) {
// int counter = 0;

// while (number > 0) {
// if (number % 2 == 0) {
// number = number / 2;
// } else {
// number = number - 1;
// }

// counter = counter + 1;
// }

// return counter;
// }

// public static void main(String[] args) {
// Solution solution = new Solution();

// int num = 14;
// int result = solution.numberOfSteps(num);

// System.out.println("Input: num = " + num);
// System.out.println("Output: " + result);
// }
// }

// third option
// class Solution {
// public int numberOfSteps(int number) {
// int counter = 0;

// while (number > 0) {
// if (number % 2 == 0) {
// number = number / 2;
// } else {
// number = number - 1;
// }

// counter = counter + 1;
// }

// return counter;
// }
// }

// and

// class Solution {
// public int numberOfSteps(int num) {
// int steps = 0;

// while (num > 0) {
// if (num % 2 == 0) {
// num = num / 2;
// } else {
// num = num - 1;
// }
// steps++;
// }

// return steps;
// }
// }