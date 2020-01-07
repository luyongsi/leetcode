/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       while (head!=null&&head.val==val){
           head=head.next;
       }
        ListNode result = head;

        while (result != null) {
            if (result.next != null && result.next.val == val) {
                result.next = result.next.next;
            }else{

                result=result.next;
            }
        }
        return head;
    }

   
}
// @lc code=end
