package String;

/**
 * ClassName MyAtoi<br>
 * Function <br>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/26 23:28
 */
public class MyAtoi {
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0){
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
