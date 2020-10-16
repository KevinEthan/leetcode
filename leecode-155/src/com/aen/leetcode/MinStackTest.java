package com.aen.leetcode;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-16 下午1:51
 */
public class MinStackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();
        System.out.println(min);
        minStack.pop();
        int top = minStack.top();
        System.out.println(top);
        int min1 = minStack.getMin();
        System.out.println(min1);
    }
}
