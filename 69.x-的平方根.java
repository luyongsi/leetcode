/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        return sqrt(0, x / 2, x);
    }

    public int sqrt(int start, int end, int x) {
        if (end == start + 1) {
            if (x / end >= end) {
                return end;
            }
            return start;
        }
        int mid = (start + end) / 2;
        if (x / mid >= mid) {
            return sqrt(mid, end, x);
        } else {
            return sqrt(start, mid, x);
        }
    }
}
// @lc code=end
