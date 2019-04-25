package String;

/**
 * ClassName ZigZagConversion<br>
 * Function <br>
 * <p>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * </p>
 * <pre>
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 * </pre>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/25 22:49
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder res = new StringBuilder();
        int len = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; i + j < len; j += cycleLen) {
                res.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < len) {
                    res.append(s.charAt(j + cycleLen - i));
                }
            }
        }

        return res.toString();
    }
}
