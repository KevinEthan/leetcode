package com.aen.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Title: {@link com.aen.leetcode}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@126.com
 * @date 20-10-19 下午5:08
 */
public class Solution {

    private Map<Character, Integer> map = new HashMap<>();

    public int numJewelsInStones(String J, String S) {
        int slen = S.length();
        int jlen = J.length();
        int count = 0;
        for (int i = 0; i < slen; ++i) {
            char s = S.charAt(i);
            for (int j = 0; j < jlen; ++j) {
                if (s == J.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void getMap(String J) {
        int len = J.length();
        for (int i = 0; i < len; ++i) {
            map.put(J.charAt(i), 1);
        }
    }
}
