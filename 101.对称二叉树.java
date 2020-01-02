/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;

        }
        if (root.left == null || root.right == null) {
            return false;
        }
        if (root.left.val != root.right.val) {
            return false;
        }
        TreeNode temp = new TreeNode(root.left.val);
        temp.left = root.left.left;
        temp.right = root.right.right;

        TreeNode temp1 = new TreeNode(root.right.val);
        temp1.left = root.right.left;
        temp1.right = root.left.right;
        return isSymmetric(temp) && isSymmetric(temp1);
    }

}
// @lc code=end
