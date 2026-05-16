import java.util.Stack;

public class PolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                if (token.equals("+")) {
                    stack.push(a + b);
                } else if (token.equals("-")) {
                    stack.push(a - b);
                } else if (token.equals("*")) {
                    stack.push(a * b);
                } else if (token.equals("/")) {
                    stack.push(a / b);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            String[] tokens1 = {"2", "1", "+", "3", "*"};
            int result1 = solution.evalRPN(tokens1);
            System.out.println("Example 1:" + String.join(" ", tokens1) + "=" + result1);
        }
    }
}
