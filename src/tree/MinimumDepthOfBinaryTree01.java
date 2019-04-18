package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName tree.MinimumDepthOfBinaryTree01<br>
 * Function <br>
 * <p>
 * Given a binary tree, find its minimum depth.The minimum depth is the number of nodes along the shortest path from
 * the root node down to the nearest leaf node.
 * </p>
 * <p>
 * 给定一个二叉树，求它的最小深度。最小深度是从根节点到最近叶子节点的最短路径上的节点数。
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/18 17:08
 */
public class MinimumDepthOfBinaryTree01 {
    public int run(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //采用BFS，记录当前层次深度
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int length, i;
        while (!queue.isEmpty()) {
            level++;
            for (length = queue.size(), i = 0; i < length; i++) {
                root = queue.poll();
                if (root.left == null && root.right == null) {
                    return level;
                }
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
            }
        }
        return 0;
    }
}

class TreeNode {
    private int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
