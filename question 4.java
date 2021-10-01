package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){


    }

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean ret = true;
        byte[] bytes = new byte[magazine.length()];
        for (int m = 0; m < ransomNote.length(); m++) {
            char c = ransomNote.charAt(m);
            boolean found = false;
            for (int n = 0; n < magazine.length(); n++) {
                if (bytes[n] == 0 && magazine.charAt(n) == c) {
                    bytes[n]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                ret = false;
                break;
            }
        }
        return ret;
    }

}

