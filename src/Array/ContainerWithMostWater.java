package Array;

/**
 * ClassName ContainerWithMostWater<br>
 * Function <br>
 * <p>
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container contains the most water.
 * </p>
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/28 22:47
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0, low = 0, high = height.length - 1, area;
        while (low < high) {
            area = Math.min(height[low], height[high]) * (high - low);
            maxArea = Math.max(area, maxArea);
            if (height[low] <= height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }
}
