package com.company;
import java.util.*;
import java.util.stream.Collectors;

class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sWord = new String(arr);

            List<String> v = m.get(sWord);
            if (v == null) {
                v = new ArrayList<>();
                m.put(sWord, v);
            }
            v.add(word);
        }


        return m.values().stream().collect(Collectors.toList());
    }
}

