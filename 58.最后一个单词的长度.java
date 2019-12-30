/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        char[] chs = s.toCharArray();
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i] != ' ') {
                ++length;
            } else if (length != 0) {
                return length;
            }

        }
        return length;
    }
}
// @lc code=end
