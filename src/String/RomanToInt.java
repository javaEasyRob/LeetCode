package String;

/**
 * ClassName RomanToInt<br>
 * Function <br>
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * </p>
 * <pre>
 *     Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII,
 * which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * </pre>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/29 23:07
 */
public class RomanToInt {
    public int romanToInt(String s) {
        int[] syms = new int[22];
        syms['M' - 'C'] = 1000;
        syms['D' - 'C'] = 500;
        syms['C' - 'C'] = 100;
        syms['L' - 'C'] = 50;
        syms['X' - 'C'] = 10;
        syms['V' - 'C'] = 5;
        syms['I' - 'C'] = 1;
        int num = 0;
        int pre = 1000;
        for (char c : s.toCharArray()) {
            int n = syms[c - 'C'];
            if (pre < n) {
                num -= 2 * pre;
            }
            num += n;
            pre = n;
        }
        return num;
    }
}
