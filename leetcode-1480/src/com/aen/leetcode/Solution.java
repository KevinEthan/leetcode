package com.aen.leetcode;

/**
 * Title: {@link Solution}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午2:48
 */
public class Solution {

    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if (len <= 1){
            return nums;
        }
        for (int i = 1; i < len; ++i) {
            nums[i] += nums[i -1];
        }
        return nums;
    }
}
