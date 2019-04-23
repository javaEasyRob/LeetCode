package Array;

/**
 * ClassName FindMedianSortedArrays03<br>
 * Function <br>
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/23 22:30
 */
public class FindMedianSortedArrays03 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 < len2) {
            // Make sure A2 is the shorter one.
            return findMedianSortedArrays(nums2, nums1);
        }
        int lo = 0, hi = len2 * 2;
        while (lo <= hi) {
            // Try Cut 2
            int mid2 = (lo + hi) / 2;
            // Calculate Cut 1 accordingly
            int mid1 = len1 + len2 - mid2;
            // Get L1, R1, L2, R2 respectively
            double l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double r1 = (mid1 == len1 * 2) ? Integer.MAX_VALUE : nums1[(mid1) / 2];
            double r2 = (mid2 == len2 * 2) ? Integer.MAX_VALUE : nums2[(mid2) / 2];
            // A1's lower half is too big; need to move C1 left (C2 right)
            if (l1 > r2) lo = mid2 + 1;
                // A2's lower half too big; need to move C2 left.
            else if (l2 > r1) hi = mid2 - 1;
                // Otherwise, that's the right cut.
            else return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
        }
        return -1;
    }
}
