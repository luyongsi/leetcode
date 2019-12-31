/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            
            return n;
        }
        int clib1 = 1;
        int clib2 = 2;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = clib1 + clib2;
            clib1 = clib2;
            clib2 = sum;
        }
        return sum;
    }
}
// @lc code=end
