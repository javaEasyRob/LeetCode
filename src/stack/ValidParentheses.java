package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * ClassName ValidParentheses<br>
 * Function <br>
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/5/9 22:22
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<Character, Character>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> letters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (mappings.containsKey(temp)) {
                if (letters.isEmpty() || !letters.pop().equals(mappings.get(temp))) {
                    return false;
                }
            } else {
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }
}
