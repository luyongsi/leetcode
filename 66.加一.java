/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            } else {
                return digits;
            }
        }
        if (digits[0] == 10) {
            int[] resutl = new int[digits.length + 1];
            resutl[0] = 1;
            return resutl;
        }
        return digits;
    }
}
// @lc code=end
