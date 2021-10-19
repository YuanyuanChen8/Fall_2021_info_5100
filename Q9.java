package com.company;

public class Q9 {
    public String reverseWords(String s){
        String trimmed = s.trim();
        int prev = trimmed.length();
        int index = prev;
        StringBuilder result = new StringBuilder();
        while ((index = trimmed.lastIndexOf(' ', index-1)) > 0) {
            if (index < prev-1) {
                result.append(trimmed.substring(index+1, prev));
                result.append(" ");
            }
            prev = index;
        }
        result.append(trimmed.substring(index+1, prev));
        return result.toString();
    }
}
