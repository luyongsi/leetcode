/*
 * @lc app=leetcode.cn id=190 lang=java
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while (count < 32) {
            res <<= 1; // res 左移一位空出位置
            res += (n & 1); // 得到的最低位加过来
            n >>= 1;// 原数字右移一位去掉已经处理过的最低位
            count++;
        }
        return res;
    }
}
// @lc code=end
