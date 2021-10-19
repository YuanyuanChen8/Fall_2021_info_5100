package com.company;

public class Q10 {
    public static void main(String[] args) {
    }
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int sum = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] != chars[i]) {
                    break;
                }
                sum++;
            }
            chars[index++] = chars[i];
            if (sum > 1) {
                String s = String.valueOf(sum);
                for (int k = 0; k < s.length(); k++) {
                    chars[index++] = s.charAt(k);
                }
            }
            i += sum;
        }
        return index;
    }
}


//443