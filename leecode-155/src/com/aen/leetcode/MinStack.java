package com.aen.leetcode;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-16 上午11:56
 */
public class MinStack {
    private int top;
    private int min;
    private int maxSize;
    private int[] data;

    public MinStack() {
        top = -1;
        min = Integer.MAX_VALUE;
        maxSize = 100000;
        data = new int[maxSize];
    }
    public void push(int x) {
        if (x < min) {
            data[++top] = min;
            min = x;
        }
        data[++top] = x;
    }

    public void pop() {
        if (min == data[top]) {
            min = data[--top];
        }
        --top;
    }

    public int top() {
        return data[top];
    }


    public int getMin() {
        return min;
    }

}
