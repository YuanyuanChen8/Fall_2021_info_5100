package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            int newF = map.getOrDefault(ch, 0) + 1;
            map.put(ch, newF);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);

            if (map.containsKey(ch) && map.get(ch)>0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                continue;
            }
        }

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
