import java.util.Map;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;

        int result = 0;
        char[] strs = s.toCharArray();
        for (int i = 0; i < strs.length; i++) {
            int next = 0;
            int tempStr = a[strs[i]- 'A'];
            if (i != strs.length - 1) {
                next = a[strs[i + 1]- 'A'];
            }
            if (tempStr < next) {
                result -= tempStr;
            } else {
                result += tempStr;
            }
        }
        return result;
    }
}
// @lc code=end
