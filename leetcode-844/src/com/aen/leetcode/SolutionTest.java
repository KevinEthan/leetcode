package com.aen.leetcode;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午2:44
 */
public class SolutionTest {

    public static void main(String[] args) {
//        输入：S = "ab#c", T = "ad#c"
//        输出：true
//        解释：S 和 T 都会变成 “ac”。
//
//        输入：S = "ab##", T = "c#d#"
//        输出：true
//        解释：S 和 T 都会变成 “”。
//
//        输入：S = "a##c", T = "#a#c"
//        输出：true
//        解释：S 和 T 都会变成 “c”。
//
//        输入：S = "a#c", T = "b"
//        输出：false
//        解释：S 会变成 “c”，但 T 仍然是 “b”。
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("ab#c", "ad#c"));
        System.out.println(solution.backspaceCompare("ab##", "c#d#"));
        System.out.println(solution.backspaceCompare("a##c", "#a#c"));
        System.out.println(solution.backspaceCompare("a#c", "b"));
    }
}
