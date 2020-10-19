package com.aen.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午4:02
 */
public class Solution {
    public int numIdenticalPairsOne(int[] nums) {
        int len = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            Integer integer = map.getOrDefault(nums[i], 0);
            count += integer;
            map.put(nums[i], integer + 1);

        }
        return count;
    }

    public int numIdenticalPairsTwo(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (nums[i] == nums[j]) {
                    ++count;
                }
            }
        }
        return count;
    }

    public int numIdenticalPairsThree(int[] nums) {
        int len = nums.length;
        int count = 0;
        int[] countArr = new int[100];
        for (int i = 0; i < len; ++i) {
            count += countArr[nums[i]];
            ++countArr[nums[i]];
        }
        return count;
    }


}
