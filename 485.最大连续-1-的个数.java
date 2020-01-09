/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i : nums) {
            if (i == 0) {
                max = Math.max(max, temp);
                temp = 0;
            } else {
                temp++;
            }
        }
        return Math.max(max, temp);
    }
}
// @lc code=end
