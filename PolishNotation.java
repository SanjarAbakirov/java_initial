import java.util.Stack;

public class PolishNotation {
    public int evalRPN(String[] tokens) {
//        Stack<Integer> stack = new Stack<>();
//        for (String token : tokens) {
//            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
//                int b = stack.pop();
//                int a = stack.pop();
//
//                if (token.equals("+")) {
//                    stack.push(a + b);
//                } else if (token.equals("-")) {
//                    stack.push(a - b);
//                } else if (token.equals("*")) {
//                    stack.push(a * b);
//                } else if (token.equals("/")) {
//                    stack.push(a / b);
//                }
//            } else {
//                stack.push(Integer.parseInt(token));
//            }
//        }
//        return stack.pop();

        //second

        int a, b;
        Stack<Integer> S = new Stack<Integer>();
        for (String s : tokens){
            if(s.equals("+")){
                S.add(S.pop() + S.pop());
            } else if(s.equals("/")){
                b = S.pop();
                a = S.pop();
                S.add(a / b);
            } else if(s.equals("*")){
                S.add(S.pop() * S.pop());
            } else if(s.equals("-")){
                b = S.pop();
                a = S.pop();
                S.add(a - b);
            } else {
                S.add(Integer.parseInt(s));
            }
        }
        return S.pop();
    }

        public static void main(String[] args) {
            PolishNotation polishNotation = new PolishNotation();

            String[] tokens1 = {"2", "1", "+", "3", "*"};
            int result1 = polishNotation.evalRPN(tokens1);
            System.out.println("Example1: " + String.join(" ", tokens1) + " = " + result1);

            String[] tokens2 = {"4", "13", "5", "/", "+"};
            int result2 = polishNotation.evalRPN(tokens2);
            System.out.println("Пример 2: " + String.join(" ", tokens2) + " = " + result2);

            String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
            int result3 = polishNotation.evalRPN(tokens3);
            System.out.println("Пример 3: " + String.join(" ", tokens3) + " = " + result3);
        }
}
