package Array;

import java.util.HashMap;

/**
 * ClassName LengthOfLongestSubstring02<br>
 * Function <br>
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/23 20:56
 */
public class LengthOfLongestSubstring02 {

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;
        int left = 0;
        if (len < 2) {
            return len;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < len; right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left) + 1;
            }
            ans = Math.max(right - left + 1, ans);
            map.put(s.charAt(right), right);
        }
        return ans;
    }

    public int lengthOfLongestSubstring1(String s) {
        int len = s.length();
        int ans = 0;
        int left = 0;
        if (len < 2) {
            return len;
        }
        int[] map = new int[128];
        for (int right = 0; right < len; right++) {
            left = Math.max(map[s.charAt(right)], left);
            ans = Math.max(right - left + 1, ans);
            map[s.charAt(right)] = right + 1;
        }
        return ans;
    }
}
