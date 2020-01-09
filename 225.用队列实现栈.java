import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    private Queue<Integer> queue1 = null;
    private Queue<Integer> queue2 = null;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int res = 0;
        int temp = queue1.size();
        for (int i = 0; i < temp - 1; i++) {
            queue2.add(queue1.poll());
        }
        res = queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
        return res;
    }

    /** Get the top element. */
    public int top() {
        int res = 0;
        int temp = queue1.size();
        for (int i = 0; i < temp - 1; i++) {
            queue2.add(queue1.poll());
        }
        res = queue1.poll();
        queue2.add(res);
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj =
 * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
