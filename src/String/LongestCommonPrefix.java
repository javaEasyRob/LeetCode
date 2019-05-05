package String;

/**
 * ClassName LongestCommonPrefix<br>
 * Function <br>
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * </p>
 * Note:<br>
 * <p>All given inputs are in lowercase letters a-z.</p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/5/5 23:28
 */
public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++)
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            return prefix;
        }
    }
}
