package com.aen.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午3:32
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int len = candies.length;
        List<Boolean> candyList = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < len; ++i) {
            candyList.add(candies[i] + extraCandies >= max);
        }
        return candyList;
    }
}
