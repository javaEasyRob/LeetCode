package String;

/**
 * ClassName ImplementIndexOf<br>
 * Function <br>
 * <p>
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/5/14 22:58
 */
public class ImplementIndexOf {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == haystack.length()) {
                    return -1;
                }
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
        }
    }
}
