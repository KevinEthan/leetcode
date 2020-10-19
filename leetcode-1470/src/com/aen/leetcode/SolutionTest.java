package com.aen.leetcode;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午3:30
 */
public class SolutionTest {
    public static void main(String[] args) {
        int[] s = new int[]{2, 5, 1, 3, 4, 7};
        Solution solution = new Solution();
        int[] shuffle = solution.shuffle(s, 3);
        for (int i : shuffle) {
            System.out.println(i);
        }
    }
}
