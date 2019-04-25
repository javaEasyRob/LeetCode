package dynamicprogramming;

/**
 * ClassName LongestPalindrome<br>
 * Function <br>
 * <p>
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/24 22:53
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0, end = 0;
        int len1, len2, maxLen;
        for (int i = 0; i < s.length() - 1; i++) {
            //assume odd length, try to extend Palindrome as possible
            len1 = expandAroundCenter(s, i, i);
            //assume even length.
            len2 = expandAroundCenter(s, i, i + 1);
            maxLen = Math.max(len1, len2);
            if (maxLen > end - start + 1) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        longestPalindrome("abcdbbfcba");
        System.out.println(-3 >> 1);
    }
}
