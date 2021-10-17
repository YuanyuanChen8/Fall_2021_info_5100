package com.company;


import java.util.ArrayList;
import java.util.List;

public class Q2 {


    public int shorteestDistance(String[] words, String word1, String word2){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0;i<words.length; i++){
            if(words[i].equals(word1))
                list1.add(i);
            if(words[i].equals(word2))
                list2.add(i);
    }
        int size = Integer.MAX_VALUE;
        int len1 = list1.size();
        int len2 = list2.size();
        for (int i=0;i<len1;i++) {
            for (int j = 0; j < len2; j++) {
                int x = Math.abs(list1.get(i) - list2.get(j));
                if (x < size)
                    size = x;
            }

        }
        return size;
    }




//记录两个单词所有出现的位置，并全部求差，取最小值即可。

    public int shortestDistance(String[] words, String word1, String word2) {
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(word2)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j));
                    }
                }
            }
        }
        return minDistance;
    }
}