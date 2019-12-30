/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int startIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[startIndex]) {
                nums[startIndex + 1] = nums[i];
                startIndex++;
            }
        }
        return startIndex + 1;
    }
}
// @lc code=end
