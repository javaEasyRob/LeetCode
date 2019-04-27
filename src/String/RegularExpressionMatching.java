package String;

/**
 * ClassName RegularExpressionMatching<br>
 * Function <br>
 * <p>
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * </p>
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * </p>
 * <p>
 * The matching should cover the entire input string (not partial).
 * </p>
 * Note:<br>
 * <p>
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/27 22:40
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean firstMatch = !s.isEmpty() && (
                s.charAt(0) == p.charAt(0) ||
                        p.charAt(0) == '.');
        if (p.length() > 1 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) ||
                    (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }

    }
}
