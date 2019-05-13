package Array;

/**
 * ClassName RemoveDuplicatesFromSortedArray<br>
 * Function <br>
 * <p>
 * Given a sorted array nums, remove the duplicates in-place such that each
 * element appear only once and return the new length.
 * </p>
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/5/14 0:06
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
