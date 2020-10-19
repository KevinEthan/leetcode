package com.aen.leetcode;

import java.util.List;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午3:39
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Boolean> booleanList = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(booleanList);
    }
}
