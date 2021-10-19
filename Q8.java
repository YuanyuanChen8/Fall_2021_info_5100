package com.company;

public class Q8 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len = s.length();
        StringBuilder str = new StringBuilder(len);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9')||(c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}



//125