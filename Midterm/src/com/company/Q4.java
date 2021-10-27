package com.company;

import java.util.HashMap;
import java.util.Map;

public class Q4 {

    public int lengthOfLongestSubstring(String s) {
        int m = s.length(), rel = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < m; j++) {


            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }

            rel = Math.max(rel, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return rel;
    }
}