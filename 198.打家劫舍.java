/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int curr = 0;
        int pre = 0;
        for (int i : nums) {
            int temp = curr;
            curr = Math.max(pre + i, curr);
            pre = temp;
        }
        return Math.max(curr, pre);
    }
}
// @lc code=end
