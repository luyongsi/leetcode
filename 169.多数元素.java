/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer temp=null;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                temp = nums[i];
            }
            if (temp == nums[i]) {
                count++;
            } else {
                count--;
               
            }
        }
        return temp;
    }
}
// @lc code=end
