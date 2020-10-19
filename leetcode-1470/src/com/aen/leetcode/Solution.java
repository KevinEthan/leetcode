package com.aen.leetcode;

/**
 * Title: {@link Solution}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午3:06
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ints = new int[len];
        int j = 0;
        for (int i = 0; i < n; ++i) {
            ints[j] = nums[i];
            ints[j + 1] = nums[i + n];
            j += 2;
        }
        return ints;
    }
}
