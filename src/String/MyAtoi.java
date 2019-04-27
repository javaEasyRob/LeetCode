package String;

/**
 * ClassName MyAtoi<br>
 * Function <br>
 * <p>
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the first non-whitespace
 * character is found. Then, starting from this character, takes an optional initial plus or minus sign
 * followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are
 * ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if
 * no such sequence exists because either str is empty or it contains only whitespace characters,
 * no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 * </p>
 * NOTE:<br>
 * <p>
 * Note:
 * <p>
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
 * range: [−231,  231 − 1]. If the numerical value is out of the range of representable values,
 * INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/26 23:28
 */
public class MyAtoi {
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int sign = 1, base = 0, i = 0;
        char[] numbers = str.toCharArray();
        if (numbers[i] == '+' || numbers[i] == '-') {
            sign = numbers[i++] == '-' ? -1 : 1;
        }
        int len = numbers.length;
        while (i < len && numbers[i] <= '9' && numbers[i] >= '0') {
            if (base > Integer.MAX_VALUE / 10 ||
                    (base == Integer.MAX_VALUE / 10 && numbers[i] > '7')) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            base = base * 10 + numbers[i++] - '0';
        }
        return base * sign;
    }
}
