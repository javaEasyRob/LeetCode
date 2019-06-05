package backtracking;

import java.util.*;

/**
 * ClassName Permutations<br>
 * Function <br>
 * <pre>
 *      Given a collection of distinct integers, return all possible permutations.
 *
 * Example:
 *
 * Input: [1,2,3]
 * Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *  </pre>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/6/5 18:10
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return permuteHelper(numSet);
    }

    private List<List<Integer>> permuteHelper(Set<Integer> numSet) {
        int n = numSet.size();
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0) {
            return Collections.singletonList(Collections.emptyList());
        } else if (n == 1) {
            result.add(new ArrayList<>(numSet));
            return result;
        }
        Set<Integer> recursionSet = new HashSet<>(numSet);
        for (Integer i : numSet) {
            recursionSet.remove(i);
            List<List<Integer>> subpermutationList = permuteHelper(recursionSet);
            recursionSet.add(i);
            for (List<Integer> subpermutation : subpermutationList) {
                subpermutation.add(i);
                result.add(subpermutation);
            }
        }
        return result;
    }
}
