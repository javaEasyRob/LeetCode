package stack;

import java.util.Stack;

/**
 * ClassName EvaluateReversePolishNotation01<br>
 * Function <br>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are+,-,*,/. Each operand may be an integer or another expression.
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * </p>
 * <p>
 * 用反波兰表示法计算算术表达式的值。
 * 有效的操作是+,-,*,/。每个操作数可以是一个整数或另一个表达式。
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/18 18:47
 */
public class EvaluateReversePolishNotation01 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> inStack = new Stack<>();
        int len = tokens.length;
        boolean flag;
        for (String token : tokens) {
            flag = "+".equals(token) || "-".equals(token)
                    || "*".equals(token) || "/".equals(token);
            if (flag) {
                int a = inStack.pop();
                int b = inStack.pop();
                inStack.push(cal(token, b, a));
            } else {
                inStack.push(Integer.parseInt(token));
            }
        }
        return inStack.pop();
    }

    private int cal(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return a / b;
        }
    }
}
