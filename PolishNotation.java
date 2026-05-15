import java.util.Stack;

public class PolishNotation {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

            }
        }
    }
}
