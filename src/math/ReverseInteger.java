package math;

/**
 * ClassName ReverseInteger<br>
 * Function <br>
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * </p>
 * <span>Note:</span><br>
 * <p>
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/25 22:36
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder str = new StringBuilder(x + "");
        if (x >= 0) {
            str.reverse();
        } else {
            str = new StringBuilder(str.substring(1)).reverse();
        }
        long temp = Long.parseLong(str.toString());
        return (int) temp == temp ? (int) temp : 0;
    }

    public int reverse1(int x) {
        long temp = 0L;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        int result = (int) temp;
        return result == temp ? result : 0;
    }
}
