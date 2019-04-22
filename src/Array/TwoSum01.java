package Array;

import java.util.HashMap;

/**
 * ClassName TwoSum01<br>
 * Function <br>
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/22 21:57
 */
public class TwoSum01 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int complement;
        for (int i = 0; i < len; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
