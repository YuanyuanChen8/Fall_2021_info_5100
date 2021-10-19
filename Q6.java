package com.company;

import java.util.HashMap;

public class Q6 {

    public boolean isIsmorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.get(key) != null) {
                if (map.get(key) != value) {
                    return false;
                }
            } else {
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}







//205
